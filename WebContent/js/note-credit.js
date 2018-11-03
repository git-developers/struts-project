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
        	
        	var rows = [];
    	    rows.push({
    	    	lcs_rea_id: $(row).find('input[name="queryVoucher"]').val(),
    	    	lcs_rec_id: $(row).find('td:eq(0) input[name="lcs_rec_id"]').val(),
    	    	lcs_sistema: $(row).find('td:eq(0) input[name="lcs_sistema"]').val(),
    	    	lcs_fecha: $(row).find('td:eq(0) input[name="lcs_fecha"]').val()
    	    });
        	
        	console.log("ROWS ::: " + JSON.stringify(rows));
        	
            $.ajax({
                url: options.contextPath + '/note-credit-process',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: JSON.stringify(rows) //$("form[name='form-note-credit-process']").serialize()
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
 
        	$(document).on('change', 'input:checkbox.row-checkbox', function(event) {
                bp.rowCheckbox(this);
            });
            

        });
    };

})(jQuery);



