package mvc.model.vo;

public class Contato {

	private int codigo;
	private String nome;
	private String telefone;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void validarCadastro() throws Exception {
		if (nome == null || nome.trim().equals("")) {
			throw new Exception("Nome não informado.");
		}
		if (telefone == null || telefone.trim().equals("")) {
			throw new Exception("Telefone não informado.");
		}
	}

	@Override
	public boolean equals(Object o) {
		Contato contato = (Contato) o;
		if (nome.equals(contato.getNome()) && telefone.equals(contato.getTelefone())) {
			return true;
		}
		return false;
	}

}