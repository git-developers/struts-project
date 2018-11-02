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
        };

        base.search = function(context) {
            $.ajax({
                url: options.contextPath + '/accrued-issue-search',
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
        	
        	console.log("PROCESS :: " + $("form[name='form-accrued-issue']").serialize());

            $.ajax({
                url: options.contextPath + '/accrued-issue-process',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: $("form[name='form-accrued-issue']").serialize()
                },
                
                beforeSend: function(jqXHR, settings) {
                	$('#modal-process').find('.modal-body').html('<p><i class="fa fa-2x fa-refresh fa-spin"></i><span style="font-size: 16px; margin-left: 5px">Procesando...</span></p>');
                	$('#modal-process').modal('show');
                },
                success: function(data, textStatus, jqXHR) {
                	$('#modal-process').modal('show');
                	$('#modal-process').find('.modal-body').html(data);
                	$("table#accrued-table tbody").html('<tr><td colspan="11" align="center">Inicie una nueva busqueda.</td></tr>');
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
            
            $.ajax({
                url: options.contextPath + '/accrued-issue-dropdown',
                type: 'POST',
                dataType: 'html',
                data: {
                	programId: $('#program').val(),
                	groupId: $('#group').val()
                },
                beforeSend: function(jqXHR, settings) {
                	
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
            
            $(".accrued-process").click(function( event ) {
            	event.preventDefault();
                bp.process(this);
            });

        });
    };

})(jQuery);



