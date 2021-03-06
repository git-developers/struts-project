<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../../themes/adminLTE/header.jsp" %>

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
		<div class="box box-solid">
			<%-- 
            <div class="box-header with-border">
              <h3 class="box-title">Quick Example</h3>
            </div>
            --%>
            <form role="form" name="form-report">
              <div class="box-body">
              
                <div class="row">
                
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Año</label>
		                  <input class="form-control" type="number" value="2018" name="queryYear">
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group pull-right">
		                  <label for="">&nbsp;</label>
							<div class="input-group">
			                  <button type="submit" class="btn btn-default report-search">Buscar</button>
			                </div>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group pull-right">
		                  <label for="">&nbsp;</label>
							<div class="input-group">
			                  <button type="button" class="btn btn-default report-export-excel">Exportar</button>
			                </div>
		                </div>
	        		</div>

        		</div>

              </div>

				<%--
              <div class="box-footer text-right">
              </div>
               --%>
            </form>
          </div>
          </div>
          </div>

      <div class="row">
        <div class="col-md-12">
		<div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Reporte</h3>
            </div>
            <div class="box-body">

        	     <table id="accrued-table" class="table table-bordered table-striped">
		              <thead>
						<tr>
						   <th style="width: 15px">#</th>
						   <th class="text-center"><i class="fa fa-fw fa-calendar"></i> Año</th>
						   <th class="text-center">Tipo</th>
						   <th class="text-center">Serie</th>
						   <th class="text-center">Programa</th>
						   <th class="text-center">ene</th>
						   <th class="text-center">feb</th>
   						   <th class="text-center">mar</th>
   						   <th class="text-center">abr</th>
   						   <th class="text-center">may</th>
   						   <th class="text-center">jun</th>
   						   <th class="text-center">jul</th>
						   <th class="text-center">ago</th>
						   <th class="text-center">set</th>
						   <th class="text-center">oct</th>
						   <th class="text-center">nov</th>
						   <th class="text-center">dic</th>
						 </tr>
		              </thead>
			            <tbody>
				            <tr>
							   	<td colspan="17" align="center">
					   				No hay datos que mostrar.
					   			</td>
				   			</tr>
			          	</tbody>
	              </table>

            </div>
            <div class="box-footer clearfix">
            </div>
          </div>
       	</div>
     </div>
     </section>
     
<%@include file="../../modal/process.jsp" %>
     
<%@include file="../../themes/adminLTE/footer.jsp" %>

