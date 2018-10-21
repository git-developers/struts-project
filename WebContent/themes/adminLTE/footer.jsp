<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>

</div>
<%-- CONTENT DIV --%>

<%
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  String date = sdf.format(new Date());
%>

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.4.0
    </div>
    <strong>
    Copyright &copy; <%=date %> <a href="#">eFACT</a>.
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
	
<c:if test="${fn:contains(pageContext.request.requestURI, 'index')}">
	<script src="themes/adminLTE/dist/js/pages/dashboard.js"></script>
	<script src="themes/adminLTE/dist/js/demo.js"></script>
</c:if>

<c:if test="${fn:contains(pageContext.request.requestURI, 'voucher')}">
	<script src="js/voucher.js"></script>
	<link rel="stylesheet" href="css/voucher.css">
	
	<script type="text/javascript">
	    $("body").formVoucher({
	    	contextPath: '${pageContext.request.contextPath}',
	    	formName: 'form-voucher'
	    });
	</script>
</c:if>



</body>
</html>
