<%@ taglib prefix="s" uri="/struts-tags" %>

<s:iterator value="listVoucher" var="voucher" status="voucherStatus">
	<tr>
		<td>
			<span class="badge bg-light-blue">
				<s:property value="%{#voucherStatus.index + 1}"/>
			</span>
			
			<input type="text" name="lcs_rea_id" value="<s:property value = "#voucher.lcs_rea_id"/>">
			<input type="text" name="lcs_rec_id" value="<s:property value = "#voucher.lcs_rec_id"/>">
			<input type="text" name="lcs_sistema" value="<s:property value = "#voucher.lcs_sistema"/>">
		</td>
		<td>
			<input type="checkbox">
		</td>
		<td>
			<s:property value = "#voucher.lcs_pro_nombre"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_aso_cod"/>
		</td>
		<td>
			<button type="button" class="btn bg-purple btn-flat btn-xs">
				<s:property value = "#voucher.lcs_con_cod"/>
			</button>
		</td>
		<td>
			<s:property value = "#voucher.lcs_aso_datos"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_fecha"/>
		</td>
		<td>
			S/ <s:property value = "#voucher.lcs_monto"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_importe"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_saldo"/>
		</td>
		<td>
			<s:if test="%{#voucher.lcs_devengado=='NO'}">
				<small class="label pull-right bg-red">No</small>
			</s:if>
			<s:elseif test="%{#voucher.lcs_devengado=='SI'}">
			    <small class="label pull-right bg-green">Si</small>
			</s:elseif>
		</td>
		<td>
			<s:property value = "#voucher.lcs_cie_id"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_sistema"/>
		</td>
	</tr>
 </s:iterator>


