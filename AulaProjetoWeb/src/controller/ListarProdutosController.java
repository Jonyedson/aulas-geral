package controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.ProdutoDAO;
import model.entity.Produto;

public class ListarProdutosController implements IControlador {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		List<Produto> produtos = produtoDAO.listar();
		
		request.setAttribute("produtos", produtos);
		RequestDispatcher rq = request.getRequestDispatcher("/WEB-INF/paginas/listar-produtos.jsp");
		rq.forward(request, response);
	}

}
