<%@ taglib prefix="s" uri="/struts-tags" %>

<s:iterator value="listAccrued" var="accrued" status="accruedStatus">
	<tr>
		<td>
			<span class="badge bg-light-blue">
				<s:property value="%{#accruedStatus.index + 1}"/>
			</span>
			
			<input type="text" name="lcs_rea_id" value="<s:property value = "#accrued.lcs_rea_id"/>">
			<input type="text" name="lcs_rec_id" value="<s:property value = "#accrued.lcs_rec_id"/>">
			<input type="text" name="lcs_sistema" value="<s:property value = "#accrued.lcs_sistema"/>">
		</td>
		<td>
			<input type="checkbox" class="accrued-data">
		</td>
		<td>
			<s:property value = "#accrued.lcs_pro_nombre"/>
		</td>
		<td>
			<s:property value = "#accrued.lcs_aso_cod"/>
		</td>
		<td>
			<button type="button" class="btn bg-purple btn-flat btn-xs">
				<s:property value = "#accrued.lcs_con_cod"/>
			</button>
		</td>
		<td>
			<s:property value = "#accrued.lcs_aso_datos"/>
		</td>
		<td>
			<s:property value = "#accrued.lcs_fecha"/>
		</td>
		<td>
			S/ <s:property value = "#accrued.lcs_monto"/>
		</td>
		<td>
			<s:property value = "#accrued.lcs_importe"/>
		</td>
	</tr>
 </s:iterator>


