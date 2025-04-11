<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Library</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="StyleSheet" href="listStyle.css" type="css/text"/>
</head>
<body class="w-75 p-3">
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
<table class="table table-bordered border border-info w-100 p-3">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach var="registration" items="${registrations}">
<tr>
<td>${registration.id}</td>
<td>${registration.name}</td>
<td>${registration.emailId}</td>
<td>${registration.mobile}</td>
<td><a href="deleteReg?emailId=${registration.emailId}"><button class="btn btn-danger">delete</button></a></td>
<td><a href="getReg?id=${registration.id}"><button class="btn btn-info">update</button></a></td>
</tr>
</c:forEach>
</table>
</div>
</nav>
</body>
</html>