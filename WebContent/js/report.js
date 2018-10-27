(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formReport = function(el, options) {

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formReport', base);

        base.init = function(){
            var totalButtons = 0;
            // base.$el.append('<button name="public" style="'+base.options.buttonStyle+'">Private</button>');
        };
        
        base.exportExcel = function(context) {
    		//var url = _this.URL_EXPORTAR + '?filtros='+ encodeURIComponent($('#formulario_consulta').serialize());
        	
        	console.log("JS :: exportExcel");
        	
    		var url = options.contextPath + '/report-export';
    		window.location.href = url;
        };
        
        base.exportTableToExcel = function(context) {
    	    var downloadLink;
    	    var dataType = 'application/vnd.ms-excel';
    	    var tableSelect = document.getElementById(options.excelTableID);
    	    var tableHTML = tableSelect.outerHTML.replace(/ /g, '%20');
    	    
    	    // Specify file name
    	    var filename = options.excelFilename?options.excelFilename+'.xls':'excel_data.xls';
    	    
    	    // Create download link element
    	    downloadLink = document.createElement("a");
    	    
    	    document.body.appendChild(downloadLink);
    	    
    	    if(navigator.msSaveOrOpenBlob){
    	        var blob = new Blob(['\ufeff', tableHTML], {
    	            type: dataType
    	        });
    	        navigator.msSaveOrOpenBlob( blob, filename);
    	    }else{
    	        // Create a link to the file
    	        downloadLink.href = 'data:' + dataType + ', ' + tableHTML;
    	    
    	        // Setting the file name
    	        downloadLink.download = filename;
    	        
    	        //triggering the function
    	        downloadLink.click();
    	    }
    	};

        
        // Private Functions
        function debug(e) {
          console.log(e);
        }

        base.init();
    };

    $.fn.formReport = function(options){

        return this.each(function(){

            var bp = new $.formReport(this, options);

            $("#export-excel").click(function( event ) {
            	event.preventDefault();
                bp.exportExcel(this);
            });
            
            $("#export-excel-2").click(function( event ) {
            	event.preventDefault();
                bp.exportTableToExcel(this);
            });

        });
    };

})(jQuery);



