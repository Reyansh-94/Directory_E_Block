<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link rel="stylesheet" href="Style.css" type="text/css"/>
</head>
<body>
<h3>Registration Form</h3>
<form action="saveReg" method="post">
	<pre>
	  Name: <input type="text" name="name" class="file">
	  <br>
	  Email: <input type="text" name="emailId" class="file">
	 <br>
	  Mobile: <input type="text" name="mobile" class="file">
	  <br>
	  <input type="submit" value="submit" class="button">
	  
	</pre>
</form>
${msg}
</body>    
</html>