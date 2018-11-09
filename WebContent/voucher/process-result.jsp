<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="%{listVoucherResult[0].status}">
	<%@include file="../../modal/success.jsp" %>
</s:if>
<s:else>
	<%@include file="../../modal/error.jsp" %>
</s:else>
          
<table class="table table-condensed">
     <thead>
		<tr>
		   <th style="width: 15px">#</th>
		   <th><i class="fa fa-fw fa-cube"></i> Lote</th>
		   <th><i class="fa fa-fw fa-list-ul"></i> Tipo</th>
		   <th><i class="fa fa-fw fa-dot-circle-o"></i> Total</th>
		 </tr>
    </thead>
    <tbody>
    
		<s:if test="%{listVoucherResult[0].status}">
			<s:iterator value="listVoucherResult" var="object" status="status">
				<tr>
					<td>
						<span class="badge bg-olive margin">
							<s:property value="%{#status.index + 1}"/>
						</span>
					</td>
					<td class="text-center">
						<s:property value = "#object.lote"/>
					</td>
					<td>
						<button type="button" class="btn bg-purple btn-flat btn-xs">
							<s:property value = "#object.tipo"/>
						</button>
					</td>
					<td>
						<s:property value = "#object.total"/>
					</td>
				</tr>
			 </s:iterator>
		</s:if>
		<s:else>
		    <tr>
				<td colspan="4" align="center">
					<s:property value = "listVoucherResult[0].resultado"/>
				</td>
			</tr>
		</s:else>
   </tbody>
</table>