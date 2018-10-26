<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="listAccruedIssue.empty">
    <tr>
		<td colspan="11" align="center">
			El proceso no retorno datos.
		</td>
	</tr>
</s:if>
<s:else>
	
	<s:iterator value="listAccruedIssue" var="object" status="status">
		<tr>
			<td>
				<span class="badge bg-light-blue">
					<s:property value="%{#status.index + 1}"/>
				</span>
				
				<input type="hidden" name="rea_id" value="<s:property value = "#object.recaudoId"/>">
			</td>
			<td>
				<s:property value = "#object.recaudoId"/>
			</td>
			<td>
				<s:property value = "#object.codigoAsociado"/>
			</td>
			<td>
				<button type="button" class="btn bg-purple btn-flat btn-xs">
					<s:property value = "#object.datosAsociados"/>
				</button>
			</td>
			<td>
				<s:property value = "#object.numeroCuota"/>
			</td>
					<td>
				<s:property value = "#object.posicion"/>
			</td>
			<td>
				<s:property value = "#object.descripcion"/>
			</td>
			<td>
				<s:property value = "#object.afecto"/>
			</td>
			<td>
				<s:property value = "#object.noAfecto"/>
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
