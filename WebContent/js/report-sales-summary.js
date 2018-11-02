(function($) {
    "use strict";

    // Global Variables
    var MAX_HEIGHT = 100;

    $.formReportSalesSummary = function(el, options) {

        // Global Private Variables
        var MAX_WIDTH = 200;
        var base = this;
        var apiContent = null;

        base.$el = $(el);
        base.el = el;
        base.$el.data('formReportSalesSummary', base);

        base.init = function(){
            var totalButtons = 0;
        };
        
        base.search = function(context) {
            $.ajax({
                url: options.contextPath + '/report-sales-summary-search',
                type: 'POST',
                dataType: 'html',
                data: {
                	fields: $(context).serialize()
                },
                beforeSend: function(jqXHR, settings) {
                	$("table tbody").html('<tr><td colspan="17" align="center"><i class="fa fa-3x fa-refresh fa-spin"></i></td></tr>');
                },
                success: function(data, textStatus, jqXHR) {
                    $("table tbody").html(data);
                },
                error: function(jqXHR, exception) {
                    console.log("error :: ajax :: voucher search");
                }
            });
        };
        
        base.exportExcel = function(context) {
    		window.location.href = options.contextPath + '/report-sales-summary-export?fields=' + encodeURIComponent($("form[name='form-report']").serialize());
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

    $.fn.formReportSalesSummary = function(options){

        return this.each(function(){

            var bp = new $.formReportSalesSummary(this, options);
            
            $("form[name='form-report']").submit(function( event ) {
            	event.preventDefault();
                bp.search(this);
            });
            
            $(".report-export-excel").click(function( event ) {
                bp.exportExcel(this);
            });

        });
    };

})(jQuery);



