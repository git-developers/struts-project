<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="listReportSalesRecord.empty">
    <tr>
		<td colspan="20" align="center">
			El proceso no retorno datos.
		</td>
	</tr>
</s:if>
<s:else>
	
	<s:iterator value="listReportSalesRecord" var="object" status="status">
		<tr>
			<td>
				<span class="badge bg-light-blue">
					<s:property value="%{#status.index + 1}"/>
				</span>
			</td>
			<td>
				<s:property value = "#object.tipoemision"/>
			</td>
			<td>
				<s:property value = "#object.rvb_tmoneda"/>
			</td>
			<td>
				<button type="button" class="btn bg-purple btn-flat btn-xs">
					<s:property value = "#object.rvb_femision"/>
				</button>
			</td>
			<td>
				<s:property value = "#object.comprobante"/>
			</td>
			<td>
				<s:property value = "#object.rvb_serie"/>
			</td>
			<td>
				<s:property value = "#object.rvb_numero"/>
			</td>
			<td>
				<s:property value = "#object.rvb_documento"/>
			</td>
			<td>
				<s:property value = "#object.rvb_datos"/>
			</td>
			<td>
				<s:property value = "#object.rvb_valorfacturado"/>
			</td>
			<td>
				<s:property value = "#object.rvb_baseimponible"/>
			</td>
			<td>
				<s:property value = "#object.rvb_impinafecta"/>
			</td>
			<td>
				<s:property value = "#object.rvb_igv"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.rvb_imptotal"/>
			</td>
			<td>
				<s:property value = "#object.tcd_venta"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.totalafectas_sol"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.totalnoafectas_sol"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.totaligv_sol"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.totaltotal_sol"/>
			</td>
			<td>
				<s:property value = "#object.rvb_id"/>
			</td>
		</tr>
	 </s:iterator>

</s:else>
