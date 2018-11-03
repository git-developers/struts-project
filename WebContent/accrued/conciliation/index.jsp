<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../../themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-exchange"></i> Conciliaci&oacute;n de devengados
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
            <form role="form" name="form-accrued-conciliation">
              <div class="box-body">
              
                <div class="row">
                
	        		<div class="col-md-3">
		                <div class="form-group">
		                  <label for="">Fecha de deposito (Desde)</label>
							<div class="input-group">
			                  <div class="input-group-addon">
			                    <i class="fa fa-calendar"></i>
			                  </div>
			                  <input type="date" class="form-control" name="queryFrom" value="<s:property value="dateTwoMonthsAgo"/>">
			                </div>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-3">
		                <div class="form-group">
		                  <label for="">Fecha de deposito (Hasta)</label>
							<div class="input-group">
			                  <div class="input-group-addon">
			                    <i class="fa fa-calendar"></i>
			                  </div>
			                  <input type="date" class="form-control" name="queryTo" value="<s:property value="currentDate"/>">
			                </div>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group pull-right">
		                  <label for="">&nbsp;</label>
							<div class="input-group">
			                  <button type="submit" class="btn btn-default accrued-search">Buscar</button>
			                </div>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group pull-right">
		                  <label for="">&nbsp;</label>
							<div class="input-group">
			                  <button type="button" class="btn btn-default accrued-process">Procesar</button>
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
              <h3 class="box-title">Conciliaci&oacute;n</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              
        	     <table id="accrued-table" class="table table-bordered table-striped">
		              <thead>
						<tr>
						   <th style="width: 15px">#</th>
						   <th style="width: 15px"><input type="checkbox" id="check-all"></th>
						   <th>Comprobante</th>
						   <th>Recaudo</th>
						   <th>Descripci&oacute;n</th>
						   <th>Afecto</th>
						   <th>No Afecto</th>
						   <th>IGV</th>
						   <th><i class="fa fa-fw fa-money"></i> Total</th>
						   <th>Sistema</th>
						 </tr>
		              </thead>
			            <tbody>
				            <tr>
							   	<td colspan="10" align="center">
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
