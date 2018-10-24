<%@ taglib prefix="s" uri="/struts-tags" %>

<s:iterator value="listAccruedConciliation" var="accrued" status="accruedStatus">
	<tr>
		<td>
			<span class="badge bg-light-blue">
				<s:property value="%{#accruedStatus.index + 1}"/>
			</span>
			
			<input type="text" name="rea_id" value="<s:property value = "#accrued.reaId"/>">
		</td>
		<td>
			<input type="checkbox" class="accrued-data">
		</td>
		<td>
			<s:property value = "#accrued.comprobante2"/>
		</td>
		<td>
			<s:property value = "#accrued.recaudo"/>
		</td>
		<td>
			<button type="button" class="btn bg-purple btn-flat btn-xs">
				<s:property value = "#accrued.descripcion"/>
			</button>
		</td>
		<td>
			<s:property value = "#accrued.afecto"/>
		</td>
		<td>
			<s:property value = "#accrued.noafecto"/>
		</td>
		<td>
			<s:property value = "#accrued.igv"/> %
		</td>
		<td>
			S/ <s:property value = "#accrued.total"/>
		</td>
	</tr>
 </s:iterator>


