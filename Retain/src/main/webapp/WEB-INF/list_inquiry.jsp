<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page include="menus.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ListInquiryDetails</title>
</head>
<body>
<form action="listInquiry" method="get">
<caption>List Inquiry Details</caption>
<table border="1">
<thead>
<tr>
<th>name</th>
<th>EmailId</th>
<th>MobileNo</th>
<th>Delete</th>
<th>Update</th>
</tr>
</thead>
<tbody>
<tr>
<%
ResultSet result = request.getAttribute("result"); 
while(result.next()) {%>
<td><%= result.getString(1) %></td>
<td><%= result.getString(2) %></td>
<td><%= result.getString(3) %></td>
<td>
<a href="deleteController?emailId=<%= result.getString(2) %>">delete</a>
</td>
<td href="updateController?mobile=<%= result.getString(3)%>"></td>

<% } %>

</tr>
</tbody>
</table>
 </form>
</body>
</html>