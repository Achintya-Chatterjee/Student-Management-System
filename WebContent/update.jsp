<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<link rel="stylesheet" href="css/update.css">
</head>
<body>
 <%@ include file="menu.jsp" %>
<jsp:useBean id="obj" class="bean.Student"></jsp:useBean>
	<form action="searchbyid" method="post">
	<table style="width:30%;margin-left: 35%;background-color: white">
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
	</table>
  </form>
  <form action="update" method="post">
			<table style="width:30%;margin-left: 35%;background-color: white">
			<tr>
				<td>Enter Your Name</td>
				<td><input type="text" name="yourname" value="${requestScope['name']}"></td>
			</tr>
			 <tr>
	   			 <td>Enter your Roll No</td>
	   			 <td><input type="text" name= "rollno" value="${requestScope['rollno']}"></td>
	  		</tr>
			<tr>
	   			 <td>Enter Password</td>
	    		 <td><input type="password" name="psw" value="${requestScope['password']}"></td>
	 		 </tr>
	 		 <tr>
	    		<td><h2>Select Gender</h2></td>
	    		<td>
	    		<c:choose>
	    			<c:when test="${requestScope['gender']=='male'}">
	    				 <input type="radio" name="gender" value="male" checked> Male<br>
					 	 <input type="radio" name="gender" value="female"> Female<br>
					  	 <input type="radio" name="gender" value="other"> Other  
	    			</c:when>
	    			<c:when test="${requestScope['gender']=='female'}">
	    				 <input type="radio" name="gender" value="male" > Male<br>
					 	 <input type="radio" name="gender" value="female" checked> Female<br>
					  	 <input type="radio" name="gender" value="other"> Other  
	    			</c:when>
	    			<c:when test="${requestScope['gender']=='other'}">
	    				 <input type="radio" name="gender" value="male" > Male<br>
					 	 <input type="radio" name="gender" value="female"> Female<br>
					  	 <input type="radio" name="gender" value="other" checked> Other  
	    			</c:when>
	    			<c:otherwise>
	    				 <input type="radio" name="gender" value="male"> Male<br>
					 	 <input type="radio" name="gender" value="female"> Female<br>
					  	 <input type="radio" name="gender" value="other"> Other  
	    			</c:otherwise>
	    		</c:choose>
			 	
				</td>
	    	</tr>
	   		<tr>
	    		<td><h3>Select Language:</h3></td>
	    		<td>
			  	<input type="checkbox" name="Bengali" value="Beng">Bengali<br>
			  	<input type="checkbox" name="English" value="Eng">English<br>
			  	<input type="checkbox" name="Hindi" value="Hin" checked>Hindi<br>
  				</td>
	    	</tr>
	    	<tr>
	    		<td>Select State</td>
	    		<td>
	    			<select name="state">
						  <option value="WB">West Bengal</option>
						  <option value="JH">Jharkhand</option>
						  <option value="BR">Bihar</option>
						  <option value="UP">Utter Pradesh</option>
						  <option value="DL">Delhi</option>
						  <option value="MB">Mumbai</option>
					  	  <option value="AS">Assam</option>
						  <option value="GJ">Gujrat</option>
						  <option value="HR">Haryana</option>
						  <option value="TL">Tamilnadu</option>
						  <option value="KR">Kerala</option>
						  <option value="HP">Himachal Pradesh</option>
					</select>
  
	    		</td>
	    	</tr>
		<tr>
			<td colspan="1" align="center"><input type="submit" name="update" value="update"></td>
		</tr>
		</table>
	</form>
</body>
</html>