<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action='Login' method='POST'>
		username<input type='text' name='username'/> 
		password<input type='text' name='password'/> 
		<input type='submit' value='login'/>
	</form>
	
	<%
	if(request.getAttribute("errore")!=null&&(Boolean)request.getAttribute("errore")){%>
	<h3>ERRORE</h3>
		<%
	}
	%>
</body>
</html>