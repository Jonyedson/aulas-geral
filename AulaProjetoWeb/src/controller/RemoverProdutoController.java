package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.ProdutoDAO;
import model.entity.Produto;

public class RemoverProdutoController implements IControlador {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int codigo = Integer.parseInt(request.getParameter("produto"));
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.abrirTransancao();
		Produto produto = produtoDAO.retornarPorCodigo(codigo);
		produtoDAO.deletar(produto);
		produtoDAO.commitarTransancao();
		produtoDAO.fecharConexao();
		response.sendRedirect("app?acao=ListarProdutosController");
	}

}
