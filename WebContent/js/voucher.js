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
                url: options.contextPath + '/comprobante-por-lote-search',
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
                    console.log("error :: 333");
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

            //$('#grupo').val(0);

            console.log( "ID ::: " + id );
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

            $( "form[name='" + options.formName + "']" ).submit(function( event ) {
            	event.preventDefault();
                bp.search(this);
            });
            
            $( "#program" ).change(function(event) {
            	bp.program(this);
        	});

        });
    };

})(jQuery);



