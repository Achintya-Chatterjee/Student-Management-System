<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="css/mystyle.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
   <h1 id="heading">Fill Your Details</h1>
   <form action="register" method="post">
	<table class="registertable">
	  <tr>
	    <td>Enter your Roll No</td>
	    <td><input type="text" name= "rollno"></td>
	  </tr>
	  <tr>
	    <td>Enter Password</td>
	    <td><input type="password" name="psw"></td>
	  </tr>
	  <tr>
	  <td>Enter You Name</td>
	    <td><input type="text" name="yourname"></td>
	  </tr>
	   
	    <tr>
	    	<td><h2>Select Gender</h2></td>
	    	<td>
			  <input type="radio" name="gender" value="male" checked> Male<br>
			  <input type="radio" name="gender" value="female"> Female<br>
			  <input type="radio" name="gender" value="other"> Other  
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
	    	<td colspan="2" align="center"><input type="submit" name="Register "></td>
	    </tr>
	    <tr>
	    	<td colspan="2" align="center"><p>${requestScope['msg']}</p></td>
	    </tr>
	</table>
	</form>
</body>
</html>