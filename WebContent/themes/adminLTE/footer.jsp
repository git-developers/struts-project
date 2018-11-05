<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</div>
<%-- CONTENT DIV --%>

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.4.0
    </div>
    <strong>
    Copyright &copy; <s:property value = "currentDateTime"/> <a href="#"><c:out value="${pageContext.request.contextPath}"/></a>.
    </strong> Todos los derechos reservados.
  </footer>
	<%@include file="aside.jsp" %>
  
  <div class="control-sidebar-bg"></div>
</div>

<script src="themes/adminLTE/bower_components/jquery/dist/jquery.min.js"></script>
<script src="themes/adminLTE/bower_components/jquery-ui/jquery-ui.min.js"></script>
<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="themes/adminLTE/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="themes/adminLTE/bower_components/raphael/raphael.min.js"></script>
<script src="themes/adminLTE/bower_components/morris.js/morris.min.js"></script>
<script src="themes/adminLTE/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
<script src="themes/adminLTE/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="themes/adminLTE/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="themes/adminLTE/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
<script src="themes/adminLTE/bower_components/moment/min/moment.min.js"></script>
<script src="themes/adminLTE/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
<script src="themes/adminLTE/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
<script src="themes/adminLTE/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="themes/adminLTE/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="themes/adminLTE/bower_components/fastclick/lib/fastclick.js"></script>
<script src="themes/adminLTE/dist/js/adminlte.min.js"></script>
<script src="themes/adminLTE/bower_components/PACE/pace.min.js"></script>

<%-- page script --%>
<script type="text/javascript">
  // To make Pace works on Ajax calls
  $(document).ajaxStart(function () {
    Pace.restart()
  });
</script>
	
<c:if test="${fn:contains(pageContext.request.requestURI, 'dashboard')}">
	<script src="themes/adminLTE/dist/js/pages/dashboard.js"></script>
	<script src="themes/adminLTE/dist/js/demo.js"></script>
</c:if>

<c:if test="${fn:contains(pageContext.request.requestURI, 'voucher/index')}">
	<script src="js/voucher.js"></script>
	<link rel="stylesheet" href="css/voucher.css">
	
	<script type="text/javascript">
	    $("body").formVoucher({
	    	contextPath: '${pageContext.request.contextPath}'
	    });
	</script>
</c:if>

<c:if test="${fn:contains(pageContext.request.requestURI, 'accrued/conciliation')}">
	<script src="js/accrued-conciliation.js"></script>
	<link rel="stylesheet" href="css/accrued-conciliation.css">
	
	<script type="text/javascript">
	    $("body").formAccruedConciliation({
	    	contextPath: '${pageContext.request.contextPath}'
	    });
	</script>
</c:if>

<c:if test="${fn:contains(pageContext.request.requestURI, 'accrued/issue')}">
	<script src="js/accrued-issue.js"></script>
	<link rel="stylesheet" href="css/accrued-issue.css">
	
	<script type="text/javascript">
	    $("body").formAccruedIssue({
	    	contextPath: '${pageContext.request.contextPath}'
	    });
	</script>
</c:if>

<c:if test="${fn:contains(pageContext.request.requestURI, 'report/sales-record')}">
	<script src="js/report-sales-record.js"></script>
	<link rel="stylesheet" href="css/report-sales-record.css">
	
	<script type="text/javascript">
	    $("body").formReportSalesRecord({
	    	contextPath: '${pageContext.request.contextPath}',
	    	excelTableID: 'export',
	    	excelFilename: 'excel-test'
	    });
	</script>
</c:if>


<c:if test="${fn:contains(pageContext.request.requestURI, 'report/sales-summary')}">
	<script src="js/report-sales-summary.js"></script>
	<link rel="stylesheet" href="css/report-sales-summary.css">
	
	<script type="text/javascript">
	    $("body").formReportSalesSummary({
	    	contextPath: '${pageContext.request.contextPath}',
	    	excelTableID: 'export',
	    	excelFilename: 'excel-test'
	    });
	</script>
</c:if>


<c:if test="${fn:contains(pageContext.request.requestURI, 'note-credit')}">
	<script src="js/note-credit.js"></script>
	<script src="js/jquery.num2words.js"></script>

	<link rel="stylesheet" href="css/note-credit.css">
	
	<script type="text/javascript">
	    $("body").formNoteCredit({
	    	contextPath: '${pageContext.request.contextPath}'
	    });
	</script>
</c:if>

<c:if test="${fn:contains(pageContext.request.requestURI, 'note-debit')}">
	<script src="js/note-debit.js"></script>
	<link rel="stylesheet" href="css/note-debit.css">
	
	<script type="text/javascript">
	    $("body").formNoteDebit({
	    	contextPath: '${pageContext.request.contextPath}'
	    });
	</script>
</c:if>



</body>
</html>
