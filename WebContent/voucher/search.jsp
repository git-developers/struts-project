<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="listVoucher.empty">
    <tr>
		<td colspan="13" align="center">
			El proceso no retorno datos.
		</td>
	</tr>
</s:if>
<s:else>
	
	<s:iterator value="listVoucher" var="object" status="status">
		<tr class="<s:if test="%{#object.isselecitem == 'NO'}">not-process</s:if>" >
			<td>
				<span class="badge bg-light-blue">
					<s:property value="%{#status.index + 1}"/>
				</span>
				
				<input type="hidden" name="lcs_rea_id" value="<s:property value = "#object.lcs_rea_id"/>">
				<input type="hidden" name="lcs_rec_id" value="<s:property value = "#object.lcs_rec_id"/>">
				<input type="hidden" name="lcs_sistema" value="<s:property value = "#object.lcs_sistema"/>">
			</td>
			<td>
				<s:if test="%{#object.isvisiblecheckbox == 'SI' && #object.isselecitem == 'NO' }">
					<input type="checkbox" class="object-data">
				</s:if>
				<s:elseif test="%{#object.isvisiblecheckbox == 'SI'}">
				    <input type="checkbox" class="object-data check-all-able">
				</s:elseif>
			</td>
			<td>
				<s:property value = "#object.lcs_pro_nombre"/>
			</td>
			<td>
				<s:property value = "#object.lcs_aso_cod"/>
			</td>
			<td>
				<button type="button" class="btn bg-purple btn-flat btn-xs">
					<s:property value = "#object.lcs_con_cod"/>
				</button>
			</td>
			<td>
				<s:property value = "#object.lcs_aso_datos"/>
			</td>
			<td>
				<s:property value = "#object.lcs_fecha"/>
			</td>
			<td class="text-right">
				S/ <s:property value = "#object.lcs_monto"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.lcs_importe"/>
			</td>
			<td class="text-right">
				<s:property value = "#object.lcs_saldo"/>
			</td>
			<td>
				<s:if test="%{#object.lcs_devengado=='NO'}">
					<small class="label pull-right bg-green">No</small>
				</s:if>
				<s:elseif test="%{#object.lcs_devengado=='SI'}">
				    <small class="label pull-right bg-green">Si</small>
				</s:elseif>
			</td>
			<td>
				<s:property value = "#object.lcs_cie_id"/>
			</td>
			<td>
				<s:property value = "#object.lcs_sistema"/>
			</td>
		</tr>
	 </s:iterator>

</s:else>
