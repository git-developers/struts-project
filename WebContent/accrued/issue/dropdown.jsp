<%@ taglib prefix="s" uri="/struts-tags" %>

<s:iterator value="listAccruedIssueDropdown" var="object" status="status">
	<option value="<s:property value = "#object.id"/>">
		<s:property value = "#object.name"/>
	</option>
 </s:iterator>
