<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page include="menu.jsp" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateList</title>
</head>
<body>
<form action="updateController" method="post">
<input type="text" placeholder="emailId" name="email">
<input type="text" placeholder="mobileNumber" name="mobile">
<input type="submit" value="update"/>
</form>
</body>
</html>