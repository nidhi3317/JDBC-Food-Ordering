<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<h2> Welcome !!</h2>
<br>

<c:forEach var="i" items="${k4}">
    <c:out value="${i.username}"></c:out>
</c:forEach> 

<a href="Welcomeuser.jsp">Home</a> 
<a href="Vieworders.jsp"> View Orders</a>
<a href="Editdetails.jsp">Edit Details</a>
<a href="Login.jsp">Logout</a>
<hr>

</body>
</html>