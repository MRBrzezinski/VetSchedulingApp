

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<title>Yahoo!!</title>
</head>
<body bgcolor="#D6DBDF">
	<p><font color="red">${errorMessage}</font></p>
	 <div style="text-align:center">
	 <h2><b><u>USER LOGIN</b></u></h2>
	 	<div class="loginform">
		<form action="/login.do" method="POST">
		<b>Username : </b><input name="name" type="text" />
		<p><b>Password : </b><input name="password" type="password" /> 
		<p><input type="submit" />
		</form>
		</div>
	</div>
</body>
</html>