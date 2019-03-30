<%@page import="model.entity.Produto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produtos</title>
</head>
<body>

	<%
		List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
	%>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Descrição</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<%
			for(Produto produto : produtos){
			%>
			<tr>
				<td><%=produto.getCodigo() %></td>
				<td><%=produto.getDescricao() %></td>
				<td>
					<a href="app?acao=RemoverProdutoController&produto=<%=produto.getCodigo()%>">Remover</a>
					<a href="app?acao=EditarProdutoController&produto=<%=produto.getCodigo()%>">Editar</a>
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<br/><br/>
	<a href="cadastrar-produto.jsp">Cadastrar Produto</a><br/>
	<a href="app">Menu Principal</a>
	
</body>
</html>