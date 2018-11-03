(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formNoteCredit = function(el, options) {

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formNoteCredit', base);

        base.init = function(){
            var totalButtons = 0;
        };

        base.search = function(context) {
            $.ajax({
                url: options.contextPath + '/note-credit-search',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: $(context).serialize()
                },
                beforeSend: function(jqXHR, settings) {
                	$('#modal-process').find('.modal-body').html('<p><i class="fa fa-2x fa-refresh fa-spin"></i><span style="font-size: 16px; margin-left: 5px">Procesando...</span></p>');
                	$("div#main-box-body").html('<div class="text-center"> <i class="fa fa-3x fa-refresh fa-spin"></i> </div>');
                },
                success: function(data, textStatus, jqXHR) {
                	$("div#main-box-body").html(data); 
                	$("button.note-credit-process").prop("disabled", false);
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher search");
                }
            });
        };
        
        base.process = function(context) {
        	
        	
        	var row = {};
        	row ['queryVoucher'] = $('select[name="queryVoucher"]').val();
        	row ['id'] = $('input[name="id"]').val();
        	row ['bd'] = $('input[name="bd"]').val();
        	row ['fechaEmision'] = $('input[name="fechaEmision"]').val();
        	row ['fechaVencimiento'] = $('input[name="fechaVencimiento"]').val();
        	row ['queryTotal'] = $('input[name="queryTotal"]').val();
        	row ['queryMoneyIntoWords'] = $('input[name="queryMoneyIntoWords"]').val();
        	
        	row ['noAfecto_1'] = $('input[name="noAfecto-1"]').val();
        	row ['afecto_1'] = $('input[name="afecto-1"]').val();
        	
        	row ['noAfecto_2'] = $('input[name="noAfecto-2"]').val();
        	row ['afecto_2'] = $('input[name="afecto-2"]').val();
        	
        	row ['noAfecto_3'] = $('input[name="noAfecto-3"]').val();
        	row ['afecto_3'] = $('input[name="afecto-3"]').val();
        	
        	row ['noAfecto_4'] = $('input[name="noAfecto-4"]').val();
        	row ['afecto_4'] = $('input[name="afecto-4"]').val();
            
        	row ['noAfecto_5'] = $('input[name="noAfecto-5"]').val();
        	row ['afecto_5'] = $('input[name="afecto-5"]').val();
            
        	row ['noAfecto_6'] = $('input[name="noAfecto-6"]').val();
        	row ['afecto_6'] = $('input[name="afecto-6"]').val();
            
        	row ['noAfecto_7'] = $('input[name="noAfecto-7"]').val();
        	row ['afecto_7'] = $('input[name="afecto-7"]').val();
            
        	row ['noAfecto_8'] = $('input[name="noAfecto-8"]').val();
        	row ['afecto_8'] = $('input[name="afecto-8"]').val();
            
        	row ['queryNoteCreditType'] = $('input[name="queryNoteCreditType"]').val();

        	
        	console.log("ROWS ::: " + JSON.stringify(row));
        	
        	
            $.ajax({
                url: options.contextPath + '/note-credit-process',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: JSON.stringify(row) //$("form[name='form-note-credit-process']").serialize()
                },
                beforeSend: function(jqXHR, settings) {
                	$('#modal-process').find('.modal-body').html('<p><i class="fa fa-2x fa-refresh fa-spin"></i><span style="font-size: 16px; margin-left: 5px">Procesando...</span></p>');
                	$('#modal-process').modal('show');
                },
                success: function(data, textStatus, jqXHR) {	
            		$('#modal-process').modal('show');
            		$('#modal-process').find('.modal-body').html(data);
            		$("div#main-box-body :input").prop("disabled", true);
            		$("button.note-credit-process").prop("disabled", true);
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher search");
                }
            });
        	
        };
        
        base.rowCheckbox = function(context) {
        	if (context.checked) {
        		$(context).closest('tr').find('input[type=number]').prop('disabled', false);
        	} else {
        		$(context).closest('tr').find('input[type=number]').prop('disabled', true);
        	}
        };
        
        base.voucher = function(context) {
        	
            var id = $(context).val();  
            
            $('.select-series').hide();
            
            $('.voucher-' + id).show();
        };
        
        // Private Functions
        function debug(e) {
          console.log(e);
        }

        base.init();
    };

    $.fn.formNoteCredit = function(options){

        return this.each(function(){

            var bp = new $.formNoteCredit(this, options);

            $("form[name='form-note-credit']").submit(function( event ) {
            	event.preventDefault();
                bp.search(this);
            });
            
            $(".note-credit-process").click(function( event ) {          	
                bp.process(this);
            });
            
            $("#select-voucher").change(function(event) {
            	bp.voucher(this);
        	});
 
        	$(document).on('change', 'input:checkbox.row-checkbox', function(event) {
                bp.rowCheckbox(this);
            });
            

        });
    };

})(jQuery);



