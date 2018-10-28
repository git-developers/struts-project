<%@ taglib prefix="s" uri="/struts-tags" %>

<s:iterator value="listAccruedIssueDropdown" var="object" status="status">
	<option value="<s:property value = "#object.cieId"/>">
		<s:property value = "#object.deadline"/>
	</option>
 </s:iterator>
