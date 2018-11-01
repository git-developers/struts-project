(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formAccruedConciliation = function(el, options) {

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formAccruedConciliation', base);

        base.init = function(){
            var totalButtons = 0;
        };

        base.search = function(context) {
            $.ajax({
                url: options.contextPath + '/accrued-conciliacion-search',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: $(context).serialize()
                },
                beforeSend: function(jqXHR, settings) {
                	$('#modal-process').find('.modal-body').html('<p><i class="fa fa-2x fa-refresh fa-spin"></i><span style="font-size: 16px; margin-left: 5px">Procesando...</span></p>');
                	$("table#accrued-table tbody").html('<tr><td colspan="9" align="center"><i class="fa fa-3x fa-refresh fa-spin"></i></td></tr>');
                },
                success: function(data, textStatus, jqXHR) {
                    $("table#accrued-table tbody").html(data);
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: search");
                }
            });
        };
        
        base.process = function(context) {
        	
        	var rows = [];
        	$("table#accrued-table tbody tr").each(function (i, row) {
        		
        		var isCheck = $(row).find('td:eq(1) input[type=checkbox]').prop('checked');

        	    if(!isCheck) {
        	        return true;
        	    }
        	    
        	    rows.push({
        	    	reaId: $(row).find('td:eq(0) input[name="rea_id"]').val(),
        	    	sistema: $(row).find('td:eq(0) input[name="sistema"]').val()
        	    });
        	});

            $.ajax({
                url: options.contextPath + '/accrued-conciliacion-process',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: JSON.stringify(rows)
                },
                
                beforeSend: function(jqXHR, settings) {
                	$('#modal-process').modal('show');
                },
                success: function(data, textStatus, jqXHR) {
                	$('#modal-process').modal('show');
                	$('#modal-process').find('.modal-body').html(data);
                	$("table#accrued-table tbody").html('<tr><td colspan="9" align="center">Inicie una nueva busqueda.</td></tr>');
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher process");
                }
            });
        };
        
        base.program = function(context) {
            var id = $(context).val();  
            
            $('.group-select').hide();
            
            $('.prod-' + id).show();
            
            if (id === '0') {
                $('.group-select').show();
            }

            $('#grupo').val(0);
        };
        
        base.checkAll = function(context) {
        	$('input:checkbox').not(context).prop('checked', context.checked);
        };
        
        // Private Functions
        function debug(e) {
          console.log(e);
        }

        base.init();
    };

    $.fn.formAccruedConciliation = function(options){

        return this.each(function(){

            var bp = new $.formAccruedConciliation(this, options);

            $("form[name='form-accrued-conciliation']").submit(function( event ) {
            	event.preventDefault();
                bp.search(this);
            });
            
            $("#check-all").click(function(event) {
            	bp.checkAll(this);
        	});
            
            $(".accrued-process").click(function( event ) {
            	event.preventDefault();
            	
                if (!$('.object-data').is(':checked')) {
                	
                	alert('Seleccione al menos un comprobante');
                    return;
                }
            	
                bp.process(this);
            });

        });
    };

})(jQuery);



