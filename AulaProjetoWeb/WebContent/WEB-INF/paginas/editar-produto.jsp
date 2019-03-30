<%@page import="model.entity.Produto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Produto</title>
</head>
<body>
	<%
		Produto produto = (Produto) request.getAttribute("produto");
	%>
	<form action="app?acao=AtualizarProdutoController" method="post">
		<input type="hidden" name="codigo" value="<%=produto.getCodigo() %>" /> 
		<label>Descrição do Produto:</label><br/>
		<input type="text" name="descricao" value="<%=produto.getDescricao() %>" /><br/><br/>
		<input type="submit" value="Atualizar Produto" />
	</form>
	<br/><br/>
	<a href="app?acao=ListarProdutosController">Lista de Produtos</a><br/>
	<a href="app">Menu Principal</a>

</body>
</html>