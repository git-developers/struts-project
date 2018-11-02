(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formNoteDebit = function(el, options) {

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formNoteDebit', base);

        base.init = function(){
            var totalButtons = 0;
        };

        base.search = function(context) {
            $.ajax({
                url: options.contextPath + '/note-debit-search',
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
                    
                    
                	setTimeout(function() {
                		$("div#main-box-body").html(data);
            		}, 1000);
                    
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher search");
                }
            });
        };
        
        base.process = function(context) {
        	
            $.ajax({
                url: options.contextPath + '/note-debit-process',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: $(context).serialize()
                },
                
                beforeSend: function(jqXHR, settings) {
                	$('#modal-process').modal('show');
                },
                success: function(data, textStatus, jqXHR) {
                	
                	setTimeout(function() {
                		$('#modal-process').modal('show');
                		$('#modal-process').find('.modal-body').html(data);
                		$("div#main-box-body").html('');
            		}, 1000);
                	
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher search");
                }
            });
        	


        	
        	/*
        	
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
            */
        };
        
        // Private Functions
        function debug(e) {
          console.log(e);
        }

        base.init();
    };

    $.fn.formNoteDebit = function(options){

        return this.each(function(){

            var bp = new $.formNoteDebit(this, options);

            $("form[name='form-note-debit']").submit(function( event ) {
            	event.preventDefault();
                bp.search(this);
            });
            
            $(".note-credit-process").click(function( event ) {
            	event.preventDefault();            	
                bp.process(this);
            });

        });
    };

})(jQuery);



