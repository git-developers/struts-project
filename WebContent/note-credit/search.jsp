<%@ taglib prefix="s" uri="/struts-tags" %>

<form role="form" name="form-note-credit-process">

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
	          <input 
	         		type="text" 
	         		class="form-control"
	         		placeholder="[000-0000]"
	         		value="<s:property value="noteCredit.serie"/>-<s:property value="noteCredit.numero"/>" 
	         		readonly="readonly">
	        </div>
      	</div>

      	<div class="col-md-6">
	      	<div class="form-group">
		          <label for="">Contrato</label>
		          <input 
		          		type="email" 
		          		class="form-control" 
		          		placeholder="[000-0000]" 
		          		value="<s:property value="noteCredit.contrato"/>" 
		          		readonly="readonly">
	        </div>
      	</div>
      	
      	<div class="col-md-12">
	      	<div class="form-group">
	          <label for="">Titular</label>
	          <input 
	          		type="text" 
	          		class="form-control" 
	          		placeholder="Ingrese nombre" 
	          		value="<s:property value="noteCredit.datos"/>" 
	          		readonly="readonly">
	        </div>
      	</div>
      	
      	<div class="col-md-6">
	        <div class="form-group">
                <label>Fecha de emisi&oacute;n</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </div>
                  <input 
                  		type="date" 
                  		class="form-control" 
                  		value="<s:property value="noteCredit.fechaEmision"/>" 
                  		readonly="readonly">
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
                  <input 
                  		type="date" 
                  		class="form-control" 
                  		value="<s:property value="noteCredit.fechaVencimiento"/>" 
                  		readonly="readonly">
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
					<s:if test="noteCredit.listNoteCreditDetail.empty">
					    <tr>
							<td colspan="6" align="center">
								El proceso no retorno datos.
							</td>
						</tr>
					</s:if>
					<s:else>
						
						<s:iterator value="noteCredit.listNoteCreditDetail" var="object" status="status">
				               <tr>
				                 <td>
				                 	<s:property value = "#object.descripcion"/>
				                 </td>
				                 <td>
				                 	<s:property value = "#object.simbolo"/>
				                 </td>
				                 <td>
				                 	<s:property value = "#object.noAfecto"/>
				                 </td>
				                 <td>
				                 	<s:property value = "#object.afecto"/>
				                 </td>
				                 <td>
				                 	<s:property value = "#object.igv"/>%
				                 </td>
				                 <td>
				                 	<s:property value = "#object.total"/>
				                 </td>
				               </tr>
						 </s:iterator>
					
					</s:else>
            	</tbody>
            	<tfoot class="bg-blue">
	               <tr>
	                 <td colspan="2">Total</td>
	                 <!-- 
	                 <td>
	                 	<s:property value = "noteCredit.listNoteCreditDetail[0].simbolo"/>
	                 </td>
	                  -->
	                 <td>
	                 	<s:property value = "noteCredit.listNoteCreditDetail[0].noAfectoSum"/>
                 	</td>
	                 <td>
	                 	<s:property value = "noteCredit.listNoteCreditDetail[0].afectoSum"/>
	                 </td>
	                 <td>
	                 	<s:property value = "noteCredit.listNoteCreditDetail[0].igvSum"/>%
	                 </td>
	                 <td>
	                 	<s:property value = "noteCredit.listNoteCreditDetail[0].totalSum"/>
	                 </td>
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
	          <input 
	          		type="text" 
	          		class="form-control" 
	          		value="Nota de cr&eacute;dito" 
	          		readonly="readonly">
	        </div>
      	</div>

      	<div class="col-md-4">
	      	<div class="form-group">
	          <label for="">Numero</label>
	          <input 
	          	type="text" 
	          	class="form-control"
	          	placeholder=""
	          	readonly="readonly">
	        </div>
      	</div>
      	
      	<div class="col-md-4">
	      	<div class="form-group">
	          <label for="">Tipo NC (09)</label>
        		 <select class="form-control" id="tipo-comprobante" name="">
                  	<s:iterator value="listNoteCreditType" var="noteCredit">
                  		<option value="<s:property value = "#noteCredit.id"/>">
                  			<s:property value = "#noteCredit.name"/>
                 			</option>
                 		</s:iterator>
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
                  <input 
                  	type="date" 
                  	class="form-control" 
                  	value="<s:property value="noteCredit.fechaEmision"/>" >
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
                  <input 
                  	type="date" 
                  	class="form-control" 
                  	value="<s:property value="noteCredit.fechaVencimiento"/>" >
                </div>
             	</div>
      	</div>
      	
      	<div class="col-md-12">
      	
      		<div class="row">
	      		<div class="col-md-4">
			        <div class="form-group">
		                <label>Total</label>
		
		                <div class="input-group">
		                  <div class="input-group-addon">
		                    <i class="fa fa-money"></i>
		                  </div>
		                  <input 
		                  	type="number" 
		                  	class="form-control" 
		                  	readonly="readonly">
		                </div>
		             </div>
	             </div>
	             
	             <div class="col-md-8">
		             <div class="form-group">
		                <label>&nbsp;</label>
		
		                <div class="input-group">
		                  <div class="input-group-addon">
		                    <i class="fa fa-align-left"></i>
		                  </div>
		                  <input 
		                  	type="number" 
		                  	class="form-control" 
		                  	readonly="readonly">
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
                 <th>total</th>
               </tr>
		  </thead>
              <tbody>
					<s:if test="noteCredit.listNoteCreditDetail.empty">
					    <tr>
							<td colspan="7" align="center">
								El proceso no retorno datos.
							</td>
						</tr>
					</s:if>
					<s:else>
						
						<s:iterator value="noteCredit.listNoteCreditDetail" var="object" status="status">
				               <tr>
			               		 <td>
			               		 	<input type="checkbox" class="row-checkbox">
	               		 		 </td>	
				                 <td>
				                 	<s:property value = "#object.descripcion"/>
				                 </td>
				                 <td>
				                 	<s:property value = "#object.simbolo"/>
				                 </td>
				                 <td>
				                 	<input type="number" class="form-control">
				                 </td>
				                 <td>
				                 	<input type="number" class="form-control">
				                 </td>
				                 <td>
				                 	<s:property value = "#object.igv"/>%
				                 </td>
				                 <td>
				                 	<s:property value = "#object.total"/>
				                 </td>
				               </tr>
						 </s:iterator>
					
					</s:else>
              
              
              
              
             
               <tr>
              	 <td><input type="checkbox" class="row-checkbox"></td>	
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
               	<td><input type="checkbox" class="row-checkbox"></td>	
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
        	
	
</form>
	
	
	
	
	