<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/delete.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
	<jsp:useBean id="obj" class="bean.Student"></jsp:useBean>
	<form action="delete" method="post">
		<table style="width:30%;margin-left: 35%;background-color: white" >
			<tr>
				<td>Select Your Id</td>
				<td>
					<select name="rollno">
						<option>Select</option>
						<c:forEach items="${obj.showAll()}" var="s">
							<option value="${s.roll_no}">${s.roll_no}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" name="register"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">${requestScope['msg']}</td>
			</tr>
		</table>
	</form>
</body>
</html>