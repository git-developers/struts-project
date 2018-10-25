<%@ taglib prefix="s" uri="/struts-tags" %>

<s:iterator value="listAccruedIssue" var="object" status="status">
	<tr>
		<td>
			<span class="badge bg-light-blue">
				<s:property value="%{#status.index + 1}"/>
			</span>
			
			<input type="hidden" name="rea_id" value="<s:property value = "#object.reaId"/>">
		</td>
		<td>
			<input type="checkbox" class="object-data">
		</td>
		<td>
			<s:property value = "#object.comprobante2"/>
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


