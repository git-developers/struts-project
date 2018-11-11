<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>

<s:head />
</head>
<body>
    <s:form action="/test">
        <s:textfield name="userName" label="User Name" />
        <s:password name="password" label="Password" />
        <s:submit value="Login" />
    </s:form>
</body>
</html>