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
            // base.$el.append('<button name="public" style="'+base.options.buttonStyle+'">Private</button>');
        };

        base.search = function(context) {
        	
        	var fields = $(context).serialize();
        	
        	console.dir(fields);
        	
            $.ajax({
                url: options.contextPath + '/voucher-search',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: fields
                },
                
                beforeSend: function(jqXHR, settings) {
                	$("table tbody").html('<tr><td colspan="13" align="center"><i class="fa fa-3x fa-refresh fa-spin"></i></td></tr>');
                },
                success: function(data, textStatus, jqXHR) {
                    $("table tbody").html(data);
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher search");
                }
            });
        };
        
        base.process = function(context) {
        	
        	var fields = $("form[name='form-voucher-process']").serialize();
        	
        	console.dir(fields);
        	
            $.ajax({
                url: options.contextPath + '/voucher-process',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: fields
                },
                
                beforeSend: function(jqXHR, settings) {
                	$('#modal-process').modal('show');
                },
                success: function(data, textStatus, jqXHR) {
                	$('#modal-process').find('.modal-body').html('XXXXXXXXXXXXXX');
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
            
            $("#check-all").click(function(event) {
            	bp.checkAll(this);
        	});
            
            $(".voucher-process").click(function( event ) {
            	event.preventDefault();
                bp.process(this);
            });

        });
    };

})(jQuery);



