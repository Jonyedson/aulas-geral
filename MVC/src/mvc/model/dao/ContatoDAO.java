package mvc.model.dao;

import java.util.ArrayList;
import java.util.List;

import mvc.model.vo.Contato;

public class ContatoDAO {
	
	private List<Contato> contatos = new ArrayList<>();
	private static ContatoDAO instance;

	private ContatoDAO() {}
	
	public static ContatoDAO getInstance() {
		if(instance == null) {
			instance = new ContatoDAO();
		}
		return instance;
	}
	
	public void inserir(Contato contato) {
		contatos.add(contato);
	}
	
	public List<Contato> getContatos(){
		return contatos;
	}

}
