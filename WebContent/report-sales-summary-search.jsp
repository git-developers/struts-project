<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="listReportSalesSummary.empty">
    <tr>
		<td colspan="17" align="center">
			El proceso no retorno datos.
		</td>
	</tr>
</s:if>
<s:else>
	
	<s:iterator value="listReportSalesSummary" var="object" status="status">
		<tr>
			<td>
				<span class="badge bg-light-blue">
					<s:property value="%{#status.index + 1}"/>
				</span>
			</td>
			<td>
				<s:property value = "#object.year"/>
			</td>
			<td>
				<s:property value = "#object.tipo"/>
			</td>
			<td>
				<s:property value = "#object.serie"/>
			</td>
			<td>
				<button type="button" class="btn bg-purple btn-flat btn-xs">
					<s:property value = "#object.programa"/>
				</button>
			</td>
			<td>
				<s:property value = "#object.ene"/>
			</td>
			<td>
				<s:property value = "#object.feb"/>
			</td>
			<td>
				<s:property value = "#object.mar"/>
			</td>
			<td>
				<s:property value = "#object.abr"/>
			</td>
			<td>
				<s:property value = "#object.may"/>
			</td>
			<td>
				<s:property value = "#object.jun"/>
			</td>
			<td>
				<s:property value = "#object.jul"/>
			</td>
			<td>
				<s:property value = "#object.ago"/>
			</td>
			<td>
				<s:property value = "#object.set"/>
			</td>
			<td>
				<s:property value = "#object.oct"/>
			</td>
			<td>
				<s:property value = "#object.nov"/>
			</td>
			<td>
				<s:property value = "#object.dic"/>
			</td>
		</tr>
	 </s:iterator>

</s:else>
