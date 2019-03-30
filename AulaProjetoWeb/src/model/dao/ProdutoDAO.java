package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.entity.Produto;

public class ProdutoDAO {
	
	private EntityManager em;
	
	public ProdutoDAO() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula_projeto_web");
		em = factory.createEntityManager();
	}
	
	public void abrirTransancao() {
		em.getTransaction().begin();
	}
	
	public void commitarTransancao() {
		em.getTransaction().commit();
	}
	
	public void fecharConexao() {
		em.close();
	}
	
	public void salvar(Produto produto) {
		em.persist(produto);
	}
	
	public void atualizar(Produto produto) {
		em.merge(produto);
	}
	
	public void deletar(Produto produto) {
		em.remove(produto);
	}
	
	public List<Produto> listar(){
		Query query = em.createQuery("SELECT e FROM Produto e");
		return query.getResultList();
	}
	
	public Produto retornarPorCodigo(int codigo) {
		return em.find(Produto.class, codigo);
	}

}
