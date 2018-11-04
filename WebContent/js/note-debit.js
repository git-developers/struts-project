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
        
        base.program = function(context) {
            var id = $('#program').val();

            $('#group').prop('selectedIndex',0);
            $('.group-select').hide();
            $('.prod-' + id).show();
        };
        
        base.group = function(context) {
        	
            var prodId = $(context).find(':selected').data('prod-id');  
            
            if (parseInt(prodId) > 0) {
                $('#program').val(prodId);
            }
            
            $.ajax({
                url: options.contextPath + '/note-debit-dropdown',
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

        base.search = function(context) {
            $.ajax({
                url: options.contextPath + '/note-debit-search',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: $(context).serialize()
                },
                beforeSend: function(jqXHR, settings) {
                	$('#modal-process').find('.modal-body').html('');
                	$("table#note-debit-table tbody").html('<div class="text-center"><i class="fa fa-3x fa-refresh fa-spin"></i></div>');
                },
                success: function(data, textStatus, jqXHR) {
                    $("table#note-debit-table tbody").html(data);
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
                	$('#modal-process').find('.modal-body').html('<p><i class="fa fa-2x fa-refresh fa-spin"></i><span style="font-size: 16px; margin-left: 5px">Procesando...</span></p>');
                	$('#modal-process').modal('show');
                },
                success: function(data, textStatus, jqXHR) {
                	$('#modal-process').modal('show');
                	$('#modal-process').find('.modal-body').html(data);
                	$("table#note-debit-table tbody").html('<tr><td colspan="13" align="center">Inicie una nueva busqueda.</td></tr>');
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher search");
                }
            });
        	
        };
        
        base.exportExcel = function(context) {
    		window.location.href = options.contextPath + '/note-debit-export?fields=' + encodeURIComponent($("form[name='form-note-debit']").serialize());
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

            $("#program").change(function(event) {
            	bp.program(this);
        	});
            
            $("#group").change(function(event) {
            	bp.group(this);
        	});
            
            $("form[name='form-note-debit']").submit(function( event ) {
            	event.preventDefault();
                bp.search(this);
            });
            
            $(".note-debit-process").click(function( event ) {         	
                bp.process(this);
            });
            
            $(".note-debit-export").click(function( event ) {
                bp.exportExcel(this);
            });

        });
    };

})(jQuery);



