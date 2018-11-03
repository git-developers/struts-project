<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../themes/adminLTE/header.jsp" %>

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
		                  	<option value="0">[todos]</option>
		                  	<s:iterator value="listSequence" var="sequence">
		                  		<option value="<s:property value = "#sequence.id"/>">
		                  			<s:property value = "#sequence.name"/>
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                  
		                  
		                  <!-- 
		                  <s:select 
		                  	name="querySequencexxxx" 
		                  	list="listSequence" 
		                  	listKey="id" 
		                  	listValue="name" 
		                  	headerKey="-1" 
		                  	headerValue="[Seleccione]"/>
	                  	 -->
		                </div>
	        		</div>
                
	        		<div class="col-md-3">
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
	        		
	        		<div class="col-md-3">
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
						   <th>Emisi&oacute;n</th>
						   <th>Tipo moneda</th>
						   <th><i class="fa fa-fw fa-calendar"></i> Fecha emisi&oacute;n</th>
						   <th>Comprobante</th>
						   <th>Serie</th>
						   <th>Numero</th>
   						   <th>Documento</th>
   						   <th>Datos</th>
   						   <th>Valor facturado</th>
   						   <th>Base imponible</th>
   						   <th>impin afecta</th>
						   <th>IGV</th>
						   <th>Importe total</th>
						   <th>Venta</th>
						   <th>Total afectas</th>
						   <th>Total no afectas</th>
						   <th>Total igv</th>
						   <th><i class="fa fa-fw fa-money"></i> Total</th>
						   <th>ID</th>
						 </tr>
		              </thead>
			            <tbody>
				            <tr>
							   	<td colspan="20" align="center">
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
     
<%@include file="../modal/process.jsp" %>
     
<%@include file="../themes/adminLTE/footer.jsp" %>

