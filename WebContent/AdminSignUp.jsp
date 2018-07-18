<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body>
   <h1>Admin SignUp Form</h1>

 <fieldset><form action="adminstart" method="post">
     
			<table style="width: 50%">
				
				
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				
				<tr>
					<td>Email_Id:</td>
					<td><input type="email" name="emailid" /></td>
				
				</tr>
				<tr>
					<td>Contact:</td>
					<td><input type="text" name="contact" /></td>
				</tr>
				</tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				</table>
				
				<br/> 
			<input type="submit" value="Submit" />
			 <input type="reset" /></td></form>
         </fieldset>
</body>
</html>