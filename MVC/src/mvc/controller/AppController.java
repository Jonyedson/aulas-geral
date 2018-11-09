package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.ContatoBO;
import mvc.model.vo.Contato;
import mvc.view.TelaPrincipal;

public class AppController implements ActionListener {
	
	private TelaPrincipal telaPrincipal;
	
	public AppController(TelaPrincipal telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
		this.telaPrincipal.getBtCadastrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == telaPrincipal.getBtCadastrar()) {
			try {
				ContatoBO contatoBO = new ContatoBO();
				Contato contato = getContatoTela();
				contatoBO.salvarContato(contato);
				telaPrincipal.limparCampos();
				telaPrincipal.adicionarContatoTabela(contato);
			}catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
	}
	
	public Contato getContatoTela() {
		Contato contato = new Contato();
		contato.setNome(telaPrincipal.getTfNome().getText());
		contato.setTelefone(telaPrincipal.getTfTelefone().getText());
		return contato;
	}

}
