<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  method="post" action="userlogin">
 
  <!-- fieldsets -->
  <fieldset>
			<h3>LOG IN </h3>
			Enter Username: <input type="text" name="uname" placeholder="Enter the User Name"/>	<br>
			
			Enter Password:	<input type="password" name="ppassword" placeholder="password"/><br>
			<input type="submit" type="submit" name="login" value="LOG IN" />
			<h4>New here?<a href="Signin.jsp">Sign up</a></h4>
	  </fieldset>
</form>
</body>
</html>