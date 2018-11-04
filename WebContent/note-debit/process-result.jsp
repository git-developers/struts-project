<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include file="../modal/success.jsp" %>

<table class="table table-condensed">
     <thead>
		<tr>
		   <th><i class="fa fa-fw fa-align-justify"></i> Resultado</th>
		 </tr>
    </thead>
    <tbody>
		<tr>
			<td>
				<s:property value = "noteDebit.resultado"/>
			</td>
		</tr>
   </tbody>
</table>