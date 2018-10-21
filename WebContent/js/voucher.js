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

        base.filter = function(context) {
        	
        	var fields = $(context).serializeArray();
        	
        	console.dir(fields);
        	
            $.ajax({
                url: 'eFACT/comprobante-por-lote-filter',
                type: 'POST',
                dataType: 'html',
                data: fields,
                beforeSend: function(jqXHR, settings) {
                    $("#initialize-array").html('Loading...');
                },
                success: function(data, textStatus, jqXHR) {
                    $("table tbody").html(data);
                },
                error: function(jqXHR, exception) {
                    console.log("error :: 333");
                }
            });
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

            $( "form[name='form-voucher']" ).submit(function( event ) {
            	event.preventDefault();
                bp.filter(this);
            });
            
            $( "#program" ).change(function(event) {
            	  console.log("PROGRAM --- WWW");
        	});

        });
    };

})(jQuery);


;(function($){
    $("body").formVoucher({
        id: '',
    });
})(jQuery);
