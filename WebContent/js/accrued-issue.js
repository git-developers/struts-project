(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formAccruedIssue = function(el, options) {

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formAccruedIssue', base);

        base.init = function(){
            var totalButtons = 0;
            // base.$el.append('<button name="public" style="'+base.options.buttonStyle+'">Private</button>');
        };

        base.search = function(context) {
        	
        	var fields = $(context).serialize();
        	
        	console.dir(fields);
        	
            $.ajax({
                url: options.contextPath + '/accrued-issue-search',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: fields
                },
                
                beforeSend: function(jqXHR, settings) {
                	$("table tbody").html('<tr><td colspan="9" align="center"><i class="fa fa-3x fa-refresh fa-spin"></i></td></tr>');
                },
                success: function(data, textStatus, jqXHR) {
                    $("table tbody").html(data);
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
        	    	reaId: $(row).find('td:eq(0) input[name="rea_id"]').val()
        	    });
        	});

            $.ajax({
                url: options.contextPath + '/accrued-issue-process',
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
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher process");
                }
            });
        };
        
        base.checkAll = function(context) {
        	$('input:checkbox').not(context).prop('checked', context.checked);
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
            $('#program').val(prodId);
            
            $.ajax({
                url: options.contextPath + '/accrued-issue-dropdown',
                type: 'POST',
                dataType: 'html',
                data: {
                	programId: $('#program').val(),
                	groupId: $('#group').val()
                },
                beforeSend: function(jqXHR, settings) {
                	//$('#modal-process').modal('show');
                },
                success: function(data, textStatus, jqXHR) {
                	$('#dateTo').html(data);
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher process");
                }
            });
        };
        
        // Private Functions
        function debug(e) {
          console.log(e);
        }

        base.init();
    };

    $.fn.formAccruedIssue = function(options){

        return this.each(function(){

            var bp = new $.formAccruedIssue(this, options);

            $("form[name='form-accrued-issue']").submit(function( event ) {
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



