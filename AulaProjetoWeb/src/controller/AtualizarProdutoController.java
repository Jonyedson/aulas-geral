package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.ProdutoDAO;
import model.entity.Produto;

public class AtualizarProdutoController implements IControlador {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		String descricao = request.getParameter("descricao");
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.abrirTransancao();
		Produto produto = produtoDAO.retornarPorCodigo(codigo);
		produto.setDescricao(descricao);
		produtoDAO.atualizar(produto);
		produtoDAO.commitarTransancao();
		produtoDAO.fecharConexao();
		response.sendRedirect("app?acao=ListarProdutosController");
	}
	
	

}
