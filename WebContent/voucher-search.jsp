<s:iterator value="listVoucher" var="voucher" status="voucherStatus">
	<tr>
		<td>
			<s:property value="%{#voucherStatus.index}"/>
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
		<td>Contrato</td>
		<td>Datos</td>
		<td>Fecha</td>
		<td>Monto</td>
		<td>Conciliado</td>
		<td>Diferencia</td>
		<td>Devengado</td>
		<td>Cod. Cierre</td>
		<td>Sistema</td>
	</tr>
 </s:iterator>
 



 
 