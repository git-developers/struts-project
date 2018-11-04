<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="listNoteDebit.empty">
    <tr>
		<td colspan="13" align="center">
			El proceso no retorno datos.
		</td>
	</tr>
</s:if>
<s:else>
	
	<s:iterator value="listNoteDebit" var="object" status="status">
		<tr>
			<td>
				<span class="badge bg-light-blue">
					<s:property value="%{#status.index + 1}"/>
				</span>
				
				<input type="hidden" name="origen" value="<s:property value = "#object.origen"/>">
			</td>
			<td>
				<s:property value = "#object.contrato"/>
			</td>
			<td>
				<s:property value = "#object.grupo"/>
			</td>
			<td>
				<s:property value = "#object.cupo"/>
			</td>
			<td>
				<button type="button" class="btn bg-purple btn-flat btn-xs">
					<s:property value = "#object.nombreAsociado"/>
				</button>
			</td>
			<td>
				<s:property value = "#object.cuota"/>
			</td>
			<td>
				<s:property value = "#object.mesGrupo"/>
			</td>
			<td>
				<s:property value = "#object.descripcion"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.noAfecto"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.afecto"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.igv"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.subTotal"/>
			</td>
			<td>
				<s:property value = "#object.penalidad"/>
			</td>
		</tr>
	 </s:iterator>

</s:else>
