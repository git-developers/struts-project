<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="%{accruedConciliation.status}">
	<%@include file="../../modal/success.jsp" %>
</s:if>
<s:else>
	<%@include file="../../modal/error.jsp" %>
</s:else>

<table class="table table-condensed">
     <thead>
		<tr>
		   <th><i class="fa fa-fw fa-align-justify"></i> Resultado</th>
		 </tr>
    </thead>
    <tbody>
		<tr>
			<td>
				<s:property value = "accruedConciliation.resultado"/>
			</td>
		</tr>
   </tbody>
</table>