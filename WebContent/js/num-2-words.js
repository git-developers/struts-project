(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formNum2Words = function(el, options) {

        var defaults = {
           units: [ "", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis","Siete", "Ocho", "Nueve", "Diez" ],
           teens: [ "Once", "Doce", "Trece", "Catorce", "Quince","Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte" ],
           tens: [ "", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta","Setenta", "Ochenta", "Noventa" ],
           othersIntl: [ "Miles", "Millones", "Billones", "Trillones" ]
        };

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formNum2Words', base);

        base.init = function(){
            var totalButtons = 0;
        };

        base.getBelowHundred = function(n) {

            if (n >= 100) {
                return "greater than or equal to 100";
            };

            if (n <= 10) {
                return defaults.units[n];
            };

            if (n <= 20) {
                return defaults.teens[n - 10 - 1];
            };

            var unit = Math.floor(n % 10);
            n /= 10;
            var ten = Math.floor(n % 10);
            var tenWord = (ten > 0 ? (defaults.tens[ten] + " ") : '');
            var unitWord = (unit > 0 ? defaults.units[unit] : '');

            return tenWord + unitWord;
        }

        base.getBelowThousand = function(n) {
        	
            if (n >= 1000) {
                return "greater than or equal to 1000";
            };
            
            var word = base.getBelowHundred(Math.floor(n % 100));
            
            n = Math.floor(n / 100);
            var hun = Math.floor(n % 10);
            word = (hun > 0 ? (defaults.units[hun] + " Ciento ") : '') + word;
            
            return word;
        }

        base.numberToWords = function(n) {

            if (isNaN(n)) {
                return "Not a number";
            };
            
            var word = '';
            var d = '';
            var val;
            var word2 = '';
            var val2;
            var b = n.toString().split(".");
            n = b[0];
            d = b[1];
            d = String (d);
            d = d.substr(0,2);
            
            val = Math.floor(n % 1000);
            n = Math.floor(n / 1000);
            
            val2 = Math.floor(d % 1000);
            d = Math.floor(d / 1000);
            
            word = base.getBelowThousand(val);
            word2 = base.getBelowThousand(val2);
            
            var othersArr = defaults.othersIntl;
            var divisor = 1000;
            var func = base.getBelowThousand;

            var i = 0;
            while (n > 0) {
                if (i == othersArr.length - 1) {
                    word = this.numberToWords(n) + " " + othersArr[i] + " " + word;
                    break;
                };
                val = Math.floor(n % divisor);
                n = Math.floor(n / divisor);
                if (val != 0) {
                    word = func(val) + " " + othersArr[i] + " " + word;
                };
                i++;
            };
            
            var i = 0;
            while (d > 0) {
                if (i == othersArr.length - 1) {
                    word2 = this.numberToWords(d) + " " + othersArr[i] + " " + word2;
                    break;
                };
                val2 = Math.floor(d % divisor);
                d = Math.floor(d / divisor);
                if (val2 != 0) {
                    word2 = func(val2) + " " + othersArr[i] + " " + word2;
                };
                i++;
            };

            if (word!='') word = word.toUpperCase() + ' SOLES';
            if (word2!='') word2 = ' y ' + word2.toUpperCase() + ' CENTS';

            return word+word2;
        }

        base.num2Words = function(n) {
        	
            var o = options;
            var units = o.units;
            var teens = o.teens;
            var tens = o.tens;
            var othersIntl = o.othersIntl;
            var currency = base.numberToWords(n);
            
            return currency;
        };

        // Private Functions
        function debug(e) {
          console.log(e);
        }

        base.init();
    };

    $.fn.formNum2Words = function(options){

        return this.each(function(){

            var bp = new $.formNum2Words(this, options);

            $(document).on('change', "input[name='queryTotal']", function(event) {

                var n = $(this).val();
                var currency = bp.num2Words(n);
                
                $('input[name="queryMoneyIntoWords"]').val(currency);
                
                console.log("OUT :: " + currency);
            });

        });
    };

})(jQuery);



