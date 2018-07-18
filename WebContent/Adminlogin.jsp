<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Food Ordering System</title>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
</head>
<body>
<div>
<!-- 1st Page :User login or signup if login valid go to home page-->
<form action="adminlogin"  method="post">

 <p>${msg}</p>
     <fieldset> <table >
        <tr>
		  <td>User Name</td>
		  <td><input type="text" name="username" id="userName" /></td>
		  </tr>
		  <tr>
		  <td>Password</td>
		  <td><input type="password" name="password" " /></td>
		  </tr>
		  <br/>
		  <tr>
			<td colspan="2" align="center"><input type="submit" value="Login" />
		    <input type="reset" /></td>
			</tr>
			
        </table><br/>
        Don't have account?<a href="AdminSignUp.jsp"> SignUp </a>
	</br></fieldset>
</form>
				
</div>
</body>
</html>