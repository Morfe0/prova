<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
<a href="Login">torna al login</a>
	<form action='Registrazione' method='POST'>
		<div>
			<label for="nome">nome</label>
			<input type='text' name='nome' />
			
		</div>
		<div>
		<label for="cognome">cognome</label>
		<input type='text' name='cognome' /> 
		</div>
		<div>
		<label for="username">username</label>
		<input type='text' name='username' /> 
		</div>
		<div>
		<label for="password">password</label>
		<input type='password' name='password' /> 
		</div>
		<div>
		<label for="dataNascita">data nascita</label>
		<input type='date' name='dataNascita' /> 
		</div>
		<div>
		<label for="codiceFiscale">C.F.</label>
		<input type='text' name='codiceFiscale' /> 
		</div>
		
		<input type='submit' value='Registrati' />
	</form>
	<% 
	String registrazione = (String)request.getAttribute("registrazione"); 
	Boolean controllo = (Boolean)request.getAttribute("controllo");
	if(controllo!=null&&controllo){
		%>
		<h3><%=registrazione %></h3>
		<%
	}else if(controllo!=null){
	%>
		<h3><%=registrazione %></h3>
	<%
	} 
	%>
	

</body>
</html>