package utils;

import model.dao.ProdutoDAO;
import model.entity.Produto;

public class Teste {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setDescricao("Produto Teste 2");
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		produtoDAO.abrirTransancao();
		produtoDAO.salvar(produto);
		produtoDAO.commitarTransancao();
		
	}

}
