<%@ taglib prefix="s" uri="/struts-tags" %>

<s:iterator value="listNoteCreditDropdown" var="object" status="status">
	<option value="<s:property value = "#object.Id"/>">
		<s:property value = "#object.name"/>
	</option>
 </s:iterator>
