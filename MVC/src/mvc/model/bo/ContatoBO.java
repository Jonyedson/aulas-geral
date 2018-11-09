package mvc.model.bo;

import java.util.List;

import mvc.model.dao.ContatoDAO;
import mvc.model.vo.Contato;

public class ContatoBO {
	
	public void salvarContato(Contato contato) throws Exception {
		contato.validarCadastro();
		ContatoDAO contatoDAO = ContatoDAO.getInstance();
		List<Contato> contatos = contatoDAO.getContatos();
		for(Contato c : contatos) {
			if(contato.equals(c)) {
				throw new Exception("O contato informado já está cadastrado.");
			}
		}
		contatoDAO.inserir(contato);
	}
	
	public List<Contato> retornarContatos(){
		ContatoDAO contatoDAO = ContatoDAO.getInstance();
		return contatoDAO.getContatos();
	}

}