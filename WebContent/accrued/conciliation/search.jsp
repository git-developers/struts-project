<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="listAccruedConciliation.empty">
    <tr>
		<td colspan="9" align="center">
			El proceso no retorno datos.
		</td>
	</tr>
</s:if>
<s:else>
	
	<s:iterator value="listAccruedConciliation" var="object" status="status">
		<tr>
			<td>
				<span class="badge bg-light-blue">
					<s:property value="%{#status.index + 1}"/>
				</span>
				
				<input type="hidden" name="rea_id" value="<s:property value = "#object.reaId"/>">
				<input type="hidden" name="sistema" value="<s:property value = "#object.sistema"/>">
			</td>
			<td>
				<s:if test="%{#object.comprobante1 != null && #object.comprobante1 != ''}">
					<input type="checkbox" class="object-data">
				</s:if>
			</td>
			<td>
				<s:property value = "#object.comprobante1"/>
			</td>
			<td>
				<s:property value = "#object.recaudo"/>
			</td>
			<td>
				<button type="button" class="btn bg-purple btn-flat btn-xs">
					<s:property value = "#object.descripcion"/>
				</button>
			</td>
			<td>
				<s:property value = "#object.afecto"/>
			</td>
			<td>
				<s:property value = "#object.noafecto"/>
			</td>
			<td>
				<s:property value = "#object.igv"/> %
			</td>
			<td>
				S/ <s:property value = "#object.total"/>
			</td>
		</tr>
	 </s:iterator>

</s:else>

