<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-hand-peace-o"></i> Comprobante por Lote
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
            <form role="form" name="form-voucher">
              <div class="box-body">
              
                <div class="row">
                
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Programa</label>
		                  <select class="form-control" id="program" name="queryProgram" required="required">
		                  	<option value="0">[todos]</option>
		                  	<s:iterator value="listProgram" var="program">
		                  		<option value="<s:property value = "#program.id"/>">
		                  			<s:property value = "#program.name"/>
		                  			<!-- (<s:property value = "#program.id"/>)  -->
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Grupos</label>
		                  <select class="form-control" name="queryGroup" id="group">
		                  	<option value="0">[todos]</option>
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
		                  <label for="exampleInputEmail1">Banco</label>
		                  <select class="form-control" name="queryBank">
		                  	<option value="99">[todos]</option>
		                  	<s:iterator value="listBank" var="bank">
		                  		<option value="<s:property value = "#bank.id"/>">
		                  			<s:property value = "#bank.name"/>
		                  			<!-- (<s:property value = "#bank.id"/>)  -->
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Comprobante</label>
		                 <select class="form-control" id="select-voucher" name="queryVoucher" required="required">
		                 	<option value="0">Todos</option> 
		                  	<s:iterator value="listVoucherDropdown" var="voucher">
		                  		<option value="<s:property value = "#voucher.id"/>">
		                  			<s:property value = "#voucher.name"/>
	                 			</option>
	                 		</s:iterator>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Estado</label>
		                  <select class="form-control" name="queryStatus">
	            			<option value="0">Conciliado</option>
                        	<option value="1">Procesado</option>
		                  </select>
		                </div>
	        		</div>
	        		
        		</div>
        		
        		<div class="row">
        		
					<div class="col-md-2">
					    <div class="form-group">
					      <label for="exampleInputEmail1">Fecha de deposito (Desde)</label>
					        <div class="input-group">
					          <div class="input-group-addon">
					            <i class="fa fa-calendar"></i>
					          </div>
					          <input type="date" class="form-control" name="queryFrom" value="<s:property value="dateOneYearAgo"/>">
					        </div>
					    </div>
					</div>
					
					<div class="col-md-2">
					    <div class="form-group">
					      <label for="exampleInputEmail1">Fecha de deposito (Hasta)</label>
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
					          <button type="submit" class="btn btn-default voucher-search">Buscar</button>
					        </div>
					    </div>
					</div>
																		
					<div class="col-md-2">
					    <div class="form-group pull-right">
					      <label for="">&nbsp;</label>
					        <div class="input-group">
					          <button type="button" class="btn btn-default voucher-process">Procesar</button>
					        </div>
					    </div>
					</div>
					
        		</div>

              </div>

				<%-- 
              <div class="box-footer text-right">
                <button type="submit" class="btn btn-sm btn-primary ">Filtro</button>
                <button type="button" class="btn btn-sm btn-success ">Por defecto</button>
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
              <h3 class="box-title">
              	Recaudados conciliados
			</h3>
             	<small class="search-count label bg-green">0</small>
            </div>
            <div class="box-body">
            
	              <table id="voucher-table" class="table table-bordered table-striped">
		              <thead>
						<tr>
						   <th style="width: 15px">#</th>
						   <th style="width: 15px"><input type="checkbox" id="check-all"></th>
						   <th class="text-center">Programa</th>
						   <th class="text-center">Asociado</th>
						   <th class="text-center">Contrato</th>
						   <th class="text-center">Datos</th>
						   <th class="text-center"><i class="fa fa-fw fa-calendar"></i> Fecha</th>
						   <th class="text-center"><i class="fa fa-fw fa-money"></i> Monto</th>
						   <th class="text-center">Conciliado</th>
						   <th class="text-center">Diferencia</th>
						   <th class="text-center">Devengado</th>
						   <th class="text-center">Cod. Cierre</th>
						   <th class="text-center">Sistema</th>
						 </tr>
		              </thead>
			            <tbody>
				            <tr>
							   	<td colspan="13" align="center">
					   				No hay datos que mostrar.
					   			</td>
				   			</tr>
			          	</tbody>
	              </table>
              
            </div>
            
            <%-- 
            <div class="box-footer clearfix">

            </div>
            --%>
          </div>
       	</div>
     </div>
     </section>
     
<%@include file="../modal/process.jsp" %>
     
<%@include file="../themes/adminLTE/footer.jsp" %>

