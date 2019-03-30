<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<h3>Login</h3>
	
	<form action="login" method="post">
		<label>Login:</label><br/>
		<input type="text" name="login" /><br/>
		<label>Senha:</label><br/>
		<input type="password" name="senha" /><br/>
		<input type="submit" value="Entrar" />
	</form>

</body>
</html>