<%@ taglib prefix="s" uri="/struts-tags" %>

<s:iterator value="listVoucher" var="voucher" status="voucherStatus">
	<tr>
		<td>
			<s:property value="%{#voucherStatus.index + 1}"/>
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
			<s:property value = "#voucher.lcs_con_cod"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_aso_datos"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_fecha"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_monto"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_importe"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_saldo"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_devengado"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_cie_id"/>
		</td>
		<td>
			<s:property value = "#voucher.lcs_sistema"/>
		</td>
	</tr>
 </s:iterator>
 
<%--
  + "           <td style='text-align:center;visibility:hidden;'>" + a.getLcs_rea_id()+ "</td>"
  + "           <td style='text-align:center;visibility:hidden;'>" + a.getLcs_rec_id()+ "</td>"
 --%>


