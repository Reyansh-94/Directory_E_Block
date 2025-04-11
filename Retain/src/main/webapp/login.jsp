<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Here</title>
</head>
<body>
<h2>Login Here</h2>
<form action="loginController" method="post">
EmailId: <input type="text" name="email"/>
PassWord: <input type="text" name="password"/>
<input type="submit" value="login"/>
<%
if(request.getAttribute("error") != null) {
	request.getAttribute("error");
}
%>
</form>
</body>
</html>