<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><font color="red">${errorMessage}</font></p>


<form action="/login.do" method="POST">
		Name : <input type="text" name="name" /> 
		Password : <input name="password" type="password" />
		<input type="submit" />
	</form>



</body>
</html>