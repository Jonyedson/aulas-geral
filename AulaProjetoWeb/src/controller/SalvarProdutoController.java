package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.ProdutoDAO;
import model.entity.Produto;

public class SalvarProdutoController implements IControlador {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String descricao = request.getParameter("descricao");
		
		Produto produto = new Produto();
		produto.setDescricao(descricao);
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.abrirTransancao();
		produtoDAO.salvar(produto);
		produtoDAO.commitarTransancao();
		produtoDAO.fecharConexao();
		
		response.sendRedirect("app?acao=ListarProdutosController");
	}
	
}
