<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-cc-visa"></i> Nota de cr&eacute;dito
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
            <form role="form" name="form-note-credit">
              <div class="box-body">
              
                <div class="row">
                
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Comprobante</label>
		                  <select class="form-control" name="queryVoucher">
                       	  	<option value="0">Todos</option>        
	                		<option value="1">Boleta de venta</option>
                			<option value="2">Factura</option>
		                  </select>
		                </div>
	        		</div>
	        		
    			    <div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Serie</label>
		                  <select class="form-control" name="querySerie">
                       	  	<option value="003">003</option>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Numero</label>
		                  <input type="number" class="form-control" name="queryNumber">
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group pull-right">
		                  <label for="">&nbsp;</label>
							<div class="input-group">
			                  <button type="submit" class="btn btn-default note-credit-search">Buscar</button>
			                </div>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group pull-right">
		                  <label for="">&nbsp;</label>
							<div class="input-group">
			                  <button type="button" class="btn btn-default note-credit-process">Procesar</button>
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
    
    
    
		<!-- MAIN DIV -->
		 <div id="main-box-body" class="row">
		       	
	
	
	
	
	
	
		
            	
        <!-- LEFT -->
		<div class="col-md-6">
		<div class="box box-primary">
		
		    <div class="box-header with-border">
		      <h3 class="box-title">Comprobante Origen</h3>
		    </div>
		    
		    	<!-- BODY -->
		      <div class="box-body">
		      
		      	<div class="col-md-6">
			      	<div class="form-group">
			          <label for="">Comprobante</label>
			          <input type="text" class="form-control" id="" placeholder="[000-0000]" value="F003-123456" readonly="readonly">
			        </div>
		      	</div>

		      	<div class="col-md-6">
			      	<div class="form-group">
			          <label for="">Contrato</label>
			          <input type="email" class="form-control" id="" placeholder="[000-0000]" value="123456" readonly="readonly">
			        </div>
		      	</div>
		      	
		      	<div class="col-md-12">
			      	<div class="form-group">
			          <label for="">Titular</label>
			          <input type="text" class="form-control" id="" placeholder="Ingrese nombre" value="Juan Perez Garcia" readonly="readonly">
			        </div>
		      	</div>
		      	
		      	<div class="col-md-6">
			        <div class="form-group">
		                <label>Fecha de emisi&oacute;n</label>
		
		                <div class="input-group">
		                  <div class="input-group-addon">
		                    <i class="fa fa-calendar"></i>
		                  </div>
		                  <input type="date" class="form-control" value="2018-10-10" readonly="readonly">
		                </div>
	              	</div>
		      	</div>
		      	
		      	<div class="col-md-6">
			        <div class="form-group">
		                <label>Fecha de vencimiento</label>
		
		                <div class="input-group">
		                  <div class="input-group-addon">
		                    <i class="fa fa-calendar"></i>
		                  </div>
		                  <input type="date" class="form-control" value="2018-10-10" readonly="readonly">
		                </div>
	              	</div>
		      	</div>
		      	
		      </div>
		      <!-- BODY -->
		      
		      
		      <!-- FOOTER -->
		      <div class="box-footer">
		      
				<table class="table table-bordered table-striped">
				  <thead class="bg-blue">
	                <tr>
	                  <th>Descripci&oacute;n</th>
	                  <th>Mon</th>
	                  <th>No afecto</th>
	                  <th>Afecto</th>
	                  <th>IGV</th>
	                  <th>Sub total</th>
	                </tr>
				  </thead>
                <tbody>
	                <tr>
	                  <td>Capital 45</td>
	                  <td>S/</td>
	                  <td>200.00</td>
	                  <td>0.00</td>
	                  <td>0.00</td>
	                  <td>200.00</td>
	                </tr>
	                <tr>
	                  <td>Seguro</td>
	                  <td>S/</td>
	                  <td>0.00</td>
	                  <td>100.00</td>
	                  <td>18.00</td>
	                  <td>118.00</td>
	                </tr>
              	</tbody>
              	<tfoot class="bg-blue">
	                <tr>
	                  <td>Total</td>
	                  <td>S/</td>
	                  <td>200.00</td>
	                  <td>100.00</td>
	                  <td>18.00</td>
	                  <td>318.00</td>
	                </tr>
			  </tfoot>
              </table>
		      
		      </div>
		      <!-- FOOTER -->
		      
		      
		  </div>
		</div>
       	<!-- LEFT -->	
            	


            	
        
        
        <!-- RIGHT -->
		<div class="col-md-6">
		<div class="box box-success">
		
		    <div class="box-header with-border">
		      <h3 class="box-title">Nota de cr&eacute;dito</h3>
		    </div>
		    
	    		<!-- BODY -->
		      <div class="box-body">
		      
		      	<div class="col-md-4">
			      	<div class="form-group">
			          <label for="">Tipo Comprobante</label>
			          <input type="text" class="form-control" id="" placeholder="[000-0000]" value="F003-123456" readonly="readonly">
			        </div>
		      	</div>

		      	<div class="col-md-4">
			      	<div class="form-group">
			          <label for="">Numero</label>
			          <input type="email" class="form-control" id="" placeholder="[000-0000]" value="123456" readonly="readonly">
			        </div>
		      	</div>
		      	
		      	<div class="col-md-4">
			      	<div class="form-group">
			          <label for="">Tipo NC (09)</label>
		                  <select class="form-control" name="xxxxx">
	            			<option value="0">Descuento por Item</option>
                        	<option value="1">xxxx</option>
		                  </select>
			        </div>
		      	</div>
		      	
		      	<div class="col-md-6">
			        <div class="form-group">
		                <label>Fecha de emisi&oacute;n</label>
		
		                <div class="input-group">
		                  <div class="input-group-addon">
		                    <i class="fa fa-calendar"></i>
		                  </div>
		                  <input type="date" class="form-control" value="2018-10-10" readonly="readonly">
		                </div>
	              	</div>
		      	</div>
		      	
		      	<div class="col-md-6">
			        <div class="form-group">
		                <label>Fecha de vencimiento</label>
		
		                <div class="input-group">
		                  <div class="input-group-addon">
		                    <i class="fa fa-calendar"></i>
		                  </div>
		                  <input type="date" class="form-control" value="2018-10-10" readonly="readonly">
		                </div>
	              	</div>
		      	</div>
		      	
		      	<div class="row">
			      	<div class="col-md-12">
				        <div class="form-group">
							
							<div class="col-md-4">
								<label>Total</label>
				                <div class="input-group">
				                  <div class="input-group-addon">
				                    S/
				                  </div>
				                  <input type="number" class="form-control" value="318">
				                </div>
			                </div>
			                						
							<div class="col-md-8">
								<label>&nbsp;</label>
				                <div class="input-group">
				                  <div class="input-group-addon">
				                    S/
				                  </div>
				                  <input type="text" class="form-control" value="Doscientos dieciocho y 00/100 soles">
				                </div>
			                </div>
		              	</div>
			      	</div>
		      	</div>
		      	
		      </div>
		      <!-- BODY -->
		      
		      
		      <!-- FOOTER -->
		      <div class="box-footer">
		      
				<table class="table table-bordered table-striped">
				  <thead class="bg-green">
	                <tr>
	                  <th>&nbsp;</th>
	                  <th>Recaudo</th>
	                  <th>Concepto</th>
	                  <th>No afecto</th>
	                  <th>Afecto</th>
	                  <th>IGV</th>
	                  <th>Sub total</th>
	                </tr>
				  </thead>
                <tbody>
	                <tr>
                		<td><input type="checkbox"></td>	
	                  <td>Capital 45</td>
	                  <td>S/</td>
	                  <td>
	                  	<input type="number" class="form-control">
	                  </td>
	                  <td>
	                  	<input type="number" class="form-control">
	                  </td>
	                  <td>0.00</td>
	                  <td>43.00</td>
	                </tr>
	                <tr>
	                	<td><input type="checkbox"></td>	
	                  <td>Seguro</td>
	                  <td>S/</td>
	                  <td>
	                  	<input type="number" class="form-control">
	                  </td>
	                  <td>
	                  	<input type="number" class="form-control">
	                  </td>
	                  <td>0.00</td>
	                  <td>59.00</td>
	                </tr>
              	</tbody>
              	<tfoot class="bg-green">
	                <tr>
	                	<th>&nbsp;</th>
	                  <td colspan="2">Total</td>
	                  <td>0.00</td>
	                  <td>0.00</td>
	                  <td>0.00</td>
	                  <td>102.00</td>
	                </tr>
			  </tfoot>
              </table>
		      
		      </div>
		      <!-- FOOTER -->
		      
		      
		  </div>
		</div>
       <!-- RIGHT -->	
          	
	
	
	
	
	
	
	
	
	
	
		
		</div>
		<!-- MAIN DIV -->
     
     
     </section>
     
<%@include file="../modal/process.jsp" %>
     
<%@include file="../themes/adminLTE/footer.jsp" %>



        