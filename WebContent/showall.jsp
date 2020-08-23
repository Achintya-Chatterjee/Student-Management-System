<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
<jsp:useBean id="obj" class="bean.Student"></jsp:useBean>
	<table border="2">
		<tr>
			<th>Roll</th>
			<th>Name</th>
			<th>Password</th>
			<th>Gender</th>
			<th>Language</th>
			<th>State</th>
		</tr>
		<c:forEach items="${obj.showAll()}" var="s">
			<tr>
				<td>${s.roll_no}</td>
				<td>${s.name}</td>
				<td>${s.password}</td>
				<td>${s.gender}</td>
				<td>${s.lang}</td>
				<td>${s.state}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>