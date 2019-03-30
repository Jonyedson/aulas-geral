package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.ProdutoDAO;
import model.entity.Produto;

public class EditarProdutoController implements IControlador {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int codigo = Integer.parseInt(request.getParameter("produto"));
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.retornarPorCodigo(codigo);
		produtoDAO.fecharConexao();
		request.setAttribute("produto", produto);
		request.getRequestDispatcher("/WEB-INF/paginas/editar-produto.jsp").forward(request, response);
	}

}
