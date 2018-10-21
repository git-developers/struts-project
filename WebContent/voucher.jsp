<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@include file="themes/adminLTE/header.jsp" %>

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
		                  <label for="exampleInputEmail1">Programa</label>
		                  <select class="form-control" id="program" name="program" required="required">
		                  	<option value="">[seleccione]</option>
		                  	<option value="22">vvvvvv</option>
		                  	<s:iterator value="listProgram" var="program">
		                  		<option value="<s:property value = "#program.id"/>">
		                  			(<s:property value = "#program.id"/>) <s:property value = "#program.name"/>
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Grupos</label>
		                  <select class="form-control" name="group">
		                  	<option value="">[seleccione]</option>
		                  	<option value="333">dddd</option>
		                  	<s:iterator value="listGroup" var="group">
		                  		<option value="<s:property value = "#group.id"/>" class="group-select prod-<s:property value = "#group.prodId"/>">
		                  			(<s:property value = "#group.prodId"/>) <s:property value = "#group.name"/>
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Banco</label>
		                  <select class="form-control" name="bank">
		                  	<option value="">[seleccione]</option>
		                  	<s:iterator value="listBank" var="bank">
		                  		<option value="<s:property value = "#bank.id"/>">
		                  			(<s:property value = "#bank.id"/>) <s:property value = "#bank.name"/>
	                  			</option>
	                  		</s:iterator>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Comprobante</label>
		                  <select class="form-control" name="voucher">
                       	  	<option value="0">Todos</option>        
	                		<option value="1">Boleta de venta</option>
                			<option value="2">Factura</option>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Estado</label>
		                  <select class="form-control" name="status">
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
					          <input type="date" class="form-control" name="from">
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
					          <input type="date" class="form-control" name="to">
					        </div>
					    </div>
					</div>
									
					<div class="col-md-2">
					    <div class="form-group">
					      <label for="">&nbsp;</label>
					        <div class="input-group">
					          <button type="submit" class="btn btn-default voucher-search">Buscar</button>
					        </div>
					    </div>
					</div>
																		
					<div class="col-md-2">
					    <div class="form-group">
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
              <h3 class="box-title">Recaudados conciliados</h3>
            </div>
            <div class="box-body">
              <table class="table table-bordered">
	              <thead>
					<tr>
					   <th style="width: 15px">#</th>
					   <th style="width: 15px">&nbsp;</th>
					   <th>Programa</th>
					   <th>Asociado</th>
					   <th>Contrato</th>
					   <th>Datos</th>
					   <th>Fecha</th>
					   <th>Monto</th>
					   <th>Conciliado</th>
					   <th>Diferencia</th>
					   <th>Devengado</th>
					   <th>Cod. Cierre</th>
					   <th>Sistema</th>
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
     
<%@include file="themes/adminLTE/footer.jsp" %>

