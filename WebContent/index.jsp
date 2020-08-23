<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
<form>
	<%@ include file="menu.jsp" %>
	<table style="width:30%">
		<tr>
			<td>Enter Admin Id</td>
			<td><input type="text" name="adminid"></td>
		</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="psw"></td>
			</tr>
				<tr>
					<td><input type="Submit" name="login" value="Login"></td>
				</tr>
	</table>
</form>
</body>
</html>