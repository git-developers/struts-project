<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="listAccruedConciliation.empty">
    <tr>
		<td colspan="10" align="center">
			El proceso no retorno datos.
		</td>
	</tr>
</s:if>
<s:else>
	
	<s:iterator value="listAccruedConciliation" var="object" status="status">
		<tr class="<s:if test="%{#object.comprobante1 != null && #object.comprobante1 != ''}">bg-teal-active</s:if>">
			<td>
				<s:if test="%{#object.comprobante1 != null && #object.comprobante1 != ''}">
					<span class="badge bg-aqua-active">
						<s:property value="%{#status.index + 1}"/>
					</span>
					
					<input type="hidden" name="rea_id" value="<s:property value = "#object.reaId"/>">
					<input type="hidden" name="sistema" value="<s:property value = "#object.sistema"/>">
				</s:if>
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
				<button type="button" class="btn bg-gray-active btn-flat btn-xs">
					<s:property value = "#object.descripcion"/>
				</button>
			</td>
			<td class="text-right">
				<s:property value = "#object.afecto"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.noafecto"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.igv"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.total"/>
			</td>
			<td>
				<small class="label bg-green">
					<s:property value = "#object.sistema"/>
				</small>
			</td>
		</tr>
	 </s:iterator>

</s:else>

