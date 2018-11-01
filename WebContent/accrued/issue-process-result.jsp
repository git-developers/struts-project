<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="info-box bg-green">
  <span class="info-box-icon"><i class="fa fa-thumbs-o-up"></i></span>

  <div class="info-box-content">
    <span class="info-box-text">Proceso terminado</span>
    <span class="info-box-number"></span>

    <div class="progress">
      <div class="progress-bar" style="width: 70%"></div>
    </div>
        <span class="progress-description"></span>
  </div>
</div>
          
          
<table class="table table-condensed">
     <thead>
		<tr>
		   <th style="width: 15px">#</th>
		   <th><i class="fa fa-fw fa-cube"></i> Lote</th>
		   <th><i class="fa fa-fw fa-list-ul"></i> Tipo</th>
		   <th><i class="fa fa-fw fa-dot-circle-o"></i> Total</th>
		 </tr>
    </thead>
    <tbody>
    <%@ taglib prefix="s" uri="/struts-tags" %>
		
		<s:if test="listVoucherResult.empty">
		    <tr>
				<td colspan="4" align="center">
					El proceso no retorno datos.
				</td>
			</tr>
		</s:if>
		<s:else>
			
			<s:iterator value="listVoucherResult" var="object" status="status">
				<tr>
					<td>
						<span class="badge bg-olive margin">
							<s:property value="%{#status.index + 1}"/>
						</span>
					</td>
					<td class="text-center">
						<s:property value = "#object.lote"/>
					</td>
					<td>
						<button type="button" class="btn bg-purple btn-flat btn-xs">
							<s:property value = "#object.tipo"/>
						</button>
					</td>
					<td>
						<s:property value = "#object.total"/>
					</td>
				</tr>
			 </s:iterator>
		
		</s:else>
   </tbody>
</table>