<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Produto</title>
</head>
<body>

	<form action="app?acao=SalvarProdutoController" method="post">
		<label>Descrição do Produto:</label><br/>
		<input type="text" name="descricao" /><br/><br/>
		<input type="submit" value="Salvar Produto" />
	</form>
	<br/><br/>
	<a href="app?acao=ListarProdutosController">Listar Produtos</a><br/>
	<a href="app">Menu Principal</a>

</body>
</html>