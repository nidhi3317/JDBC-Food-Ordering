<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
</head>
<body>




<div style="border:2px solid #333; width:350px; padding:20px; margin:20px">
<form action="start" method="post">
<h1>add login</h1>
<p>username<input type="text" name="username"></p>
<p>password<input type="text" name="password"></p>
<input type="submit" value="add">
</form>
${k1}
</div>
<div  style="border:2px solid #333; width:350px; padding:20px; margin:20px">
<h1>Show All Data</h1>

<table border=1>
<tr>
<th>username</th>
<th>password</th>
</tr>
<c:forEach var="i" items="${k2}">
 <tr>
  <td>  <c:out value="${i.username}"></c:out></td>
  <td>  <c:out value="${i.password}"></c:out></td>
  </tr>  
</c:forEach>
</table>

</div>


</br>


<div style="border:2px solid #333; width:350px; padding:20px; margin:20px;">
<h1>Single Select on the basis of username</h1>
<form action="singleselect" method="post">
<p>username<input type="text" name="username"></p>
<input type="submit" value="getDetail">
</form>

<table border=1>
<tr>
<th>username</th>
<th>password</th>

</tr>
<c:forEach var="i" items="${k4}">
 <tr>
  <td>  <c:out value="${i.username}"></c:out></td>
  <td>  <c:out value="${i.password}"></c:out></td>
 
  </tr>  
</c:forEach>
</table>

</div>
 

</br>


</body>
</html>