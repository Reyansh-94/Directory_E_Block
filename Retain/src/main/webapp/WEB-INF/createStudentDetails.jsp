<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students Details</title>
</head>
<body>
<h2>Insert Student Details</h2>
<form action="createStudent" method="post">
Name: <input type="text" name="name"/>
EmailId: <input type="text" name="email"/>
Mobile: <input type="text" name="mobile"/>
<input type="submit" value="add"/>
</form>
<% 
if(request.getAttribute("message") != null) {
out.println(request.getAttribute("message"));
}
%>

</body>
</html>