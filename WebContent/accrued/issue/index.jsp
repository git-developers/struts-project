<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../../themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-exchange"></i> Emisi&oacute;n de devengados
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
            <form role="form" name="form-accrued-issue">
              <div class="box-body">
              
                <div class="row">
                
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Programa</label>
		                  <select class="form-control" id="program" name="queryProgram" required="required">
		                  	<s:iterator value="listProgram" var="program">
		                  		<option value="<s:property value = "#program.id"/>">
		                  			<s:property value = "#program.name"/>
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Grupos</label>
		                  <select class="form-control" name="queryGroup" id="group" required="required">
		                  	<option>[seleccione]</option>
		                  	<s:iterator value="listGroup" var="group">
		                  		<option 
		                  			data-prod-id="<s:property value = "#group.prodId"/>"
		                  			value="<s:property value = "#group.id"/>" 
		                  			class="group-select prod-<s:property value = "#group.prodId"/>">
		                  			<s:property value = "#group.name"/>
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Fecha de fin</label>
		                  <select class="form-control" id="dateTo" name="queryDateTo" required="required">
		                  	<option value="0">[seleccionar]</option>
		                  </select>
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
						   <th class="text-center">Recaudo Id</th>
						   <th class="text-center">C&oacute;digo asociado</th>
						   <th class="text-center">Datos asociado</th>
						   <th class="text-center">Numero de cuota</th>
						   <th class="text-center">Grupo mes</th>
						   <th class="text-center">Descripci&oacute;n</th>
						   <th class="text-center">Afecto</th>
						   <th class="text-center">No Afecto</th>
						   <th class="text-center">IGV</th>
						   <th class="text-center"><i class="fa fa-fw fa-money"></i> Total</th>
						 </tr>
		              </thead>
			            <tbody>
				            <tr>
							   	<td colspan="11" align="center">
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
