<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-line-chart"></i> Reporte: registro de ventas
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
		                  <label for="">Lote</label>
		                  <select class="form-control" id="program" name="querySequence">
		                  	<s:iterator value="listSequence" var="sequence">
		                  		<option value="<s:property value = "#sequence.id"/>">
		                  			<s:property value = "#sequence.name"/>
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                </div>
	        		</div>
                
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Fecha de emision (Desde)</label>
							<div class="input-group">
			                  <div class="input-group-addon">
			                    <i class="fa fa-calendar"></i>
			                  </div>
			                  <input type="date" class="form-control" name="queryFrom">
			                </div>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Fecha de emision (Hasta)</label>
							<div class="input-group">
			                  <div class="input-group-addon">
			                    <i class="fa fa-calendar"></i>
			                  </div>
			                  <input type="date" class="form-control" name="queryTo">
			                </div>
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
			                  <button type="button" class="btn btn-default report-process">Procesar</button>
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
              
        	     <table id="accrued-table" class="table table-bordered">
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
						 </tr>
		              </thead>
			            <tbody>
				            <tr>
							   	<td colspan="9" align="center">
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
     
<%@include file="modal-process.jsp" %>
     
<%@include file="themes/adminLTE/footer.jsp" %>

