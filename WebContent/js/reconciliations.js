(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formReconciliations = function(el, options) {

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formReconciliations', base);

        base.init = function(){
            var totalButtons = 0;
            // base.$el.append('<button name="public" style="'+base.options.buttonStyle+'">Private</button>');
        };

        base.filter = function(context) {
        	
        	var fields = $(context).serializeArray();
        	
        	console.dir(fields);
        	
            $.ajax({
                url: 'eFACT/conciliaciones-filter',
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

    $.fn.formReconciliations = function(options){

        return this.each(function(){

            var bp = new $.formReconciliations(this, options);

            $( "form[name='form-reconciliations']" ).submit(function( event ) {
            	event.preventDefault();
                bp.filter(this);
            });

        });
    };

})(jQuery);


;(function($){
    $("body").formReconciliations({
        id: '',
    });
})(jQuery);
