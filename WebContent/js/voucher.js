(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formVoucher = function(el, options) {

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formVoucher', base);

        base.init = function(){
            var totalButtons = 0;
        };

        base.search = function(context) {
            $.ajax({
                url: options.contextPath + '/voucher-search',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: $(context).serialize()
                },
                
                beforeSend: function(jqXHR, settings) {
                	$("table#voucher-table tbody").html('<tr><td colspan="13" align="center"><i class="fa fa-3x fa-refresh fa-spin"></i></td></tr>');
                },
                success: function(data, textStatus, jqXHR) {
                    $("table#voucher-table tbody").html(data);
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher search");
                }
            });
        };
        
        base.process = function(context) {
        	
        	var rows = [];
        	$("table#voucher-table tbody tr").each(function (i, row) {
        		
        		var isCheck = $(row).find('td:eq(1) input[type=checkbox]').prop('checked');

        	    if(!isCheck) {
        	        return true;
        	    }
        	    
        	    rows.push({
        	    	lcs_rea_id: $(row).find('td:eq(0) input[name="lcs_rea_id"]').val(),
        	    	lcs_rec_id: $(row).find('td:eq(0) input[name="lcs_rec_id"]').val(),
        	    	lcs_sistema: $(row).find('td:eq(0) input[name="lcs_sistema"]').val()
        	    });
        	});

            $.ajax({
                url: options.contextPath + '/voucher-process',
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
                	$("table#voucher-table tbody").html('<tr><td colspan="13" align="center">Inicie una nueva busqueda.</td></tr>');
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
        
        base.group = function(context) {
            var prodId = $(context).find(':selected').data('prod-id');
            
            if (parseInt(prodId) > 0) {
                $('#program').val(prodId);
            }
        };
        
        base.checkAll = function(context) {
        	$('input:checkbox.check-all-able').not(context).prop('checked', context.checked);
        };
        
        // Private Functions
        function debug(e) {
          console.log(e);
        }

        base.init();
    };

    $.fn.formVoucher = function(options){

        return this.each(function(){

            var bp = new $.formVoucher(this, options);

            $("form[name='form-voucher']").submit(function( event ) {
            	event.preventDefault();
                bp.search(this);
            });
            
            $("#program").change(function(event) {
            	bp.program(this);
        	});
            
            $("#group").change(function(event) {
            	bp.group(this);
        	});
            
            $("#check-all").click(function(event) {
            	bp.checkAll(this);
        	});
            
            $(".voucher-process").click(function( event ) {
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



