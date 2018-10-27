<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@include file="themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-pie-chart"></i> Reporte: resumen de ventas
        <small>grid</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Dashboard</li>
      </ol>
    </section>

    <section class="content">
    
    
    
      <div class="row">
        <div class="col-md-12">
		<div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title"> xxxx</h3>
            </div>
            <div class="box-body">
              
              <button id="export-excel">EXPORT EXCEL</button>
              <button id="export-excel-2">Export HTML Table To Excel File</button>
              
              
<table id="customers">
  <tbody>
	  <tr>
	    <th>Company</th>
	    <th>Contact</th>
	    <th>Country</th>
	  </tr>
	  <tr>
	    <td>Alfreds Futterkiste</td>
	    <td>Maria Anders</td>
	    <td>Germany</td>
	  </tr>
	  <tr>
	    <td>Centro comercial Moctezuma</td>
	    <td>Francisco Chang</td>
	    <td>Mexico</td>
	  </tr>
	  <tr>
	    <td>Ernst Handel</td>
	    <td>Roland Mendel</td>
	    <td>Austria</td>
	  </tr>
	  <tr>
	    <td>Island Trading</td>
	    <td>Helen Bennett</td>
	    <td>UK</td>
	  </tr>
	  <tr>
	    <td>Laughing Bacchus Winecellars</td>
	    <td>Yoshi Tannamuri</td>
	    <td>Canada</td>
	  </tr>
	  <tr>
	    <td>Magazzini Alimentari Riuniti</td>
	    <td>Giovanni Rovelli</td>
	    <td>Italy</td>
	  </tr>
	</tbody>
</table>
              
              
              
              
              
              
              
            </div>
            <!-- /.box-body -->
            <div class="box-footer clearfix">

            </div>
          </div>
       	</div>
     </div>
     </section>
     
<%@include file="themes/adminLTE/footer.jsp" %>

<script type="text/javascript">
	    	

</script>



<!-- 
<script src="https://www.jqueryscript.net/demo/Exporting-Html-Tables-To-CSV-XLS-XLSX-Text-TableExport/FileSaver.min.js"></script>
<script src="https://www.jqueryscript.net/demo/Exporting-Html-Tables-To-CSV-XLS-XLSX-Text-TableExport/Blob.min.js"></script>
<script src="https://www.jqueryscript.net/demo/Exporting-Html-Tables-To-CSV-XLS-XLSX-Text-TableExport/xls.core.min.js"></script>
<script src="https://www.jqueryscript.net/demo/Exporting-Html-Tables-To-CSV-XLS-XLSX-Text-TableExport/dist/js/tableexport.js"></script>

<script>
$("table").tableExport({formats: ["xlsx","xls", "csv", "txt"],    });
</script>
 -->

