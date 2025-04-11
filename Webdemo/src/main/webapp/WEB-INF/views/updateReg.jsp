<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Form</title>
</head>
<body>
<h3>Update Registration Form</h3>
<form action="updateReg" method="post">
<input type="hidden" name="id" value="${registration.id}"/>
	<pre>
	  Name: <input type="text" name="name" value="${registration.name}">
	  <br>
	  Email: <input type="text" name="emailId" value = "${registration.emailId}">
	 <br>
	  Mobile: <input type="text" name="mobile" value="${registration.mobile}">
	  <br>
	  <input type="submit" value="update">
	</pre>
</form>
${msg}
</body>    
</html>