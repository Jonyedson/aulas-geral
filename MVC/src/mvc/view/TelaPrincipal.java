package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.Contato;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lbNome;
	private JLabel lbTelefone;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JButton btCadastrar;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();

	public TelaPrincipal() {
		this.setTitle("MVC");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		this.lbNome = new JLabel("Nome");
		this.lbTelefone = new JLabel("Telefone");

		this.tfNome = new JTextField("");
		this.tfTelefone = new JTextField();

		this.btCadastrar = new JButton("Cadastrar");

		this.lbNome.setBounds(20, 20, 150, 20);
		this.lbTelefone.setBounds(400, 20, 150, 20);

		this.tfNome.setBounds(20, 50, 350, 25);
		this.tfTelefone.setBounds(400, 50, 200, 25);

		this.btCadastrar.setBounds(20, 85, 200, 25);

		criarTabela();
		barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(20, 125, 580, 420);

		this.add(lbNome);
		this.add(lbTelefone);

		this.add(tfNome);
		this.add(tfTelefone);

		this.add(btCadastrar);

		this.add(barraRolagem);
	}
	
	public void limparCampos() {
		tfNome.setText("");
		tfTelefone.setText("");
	}
	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Nome");
		modelo.addColumn("Telefone");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(380);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
	}

	public void adicionarContatoTabela(Contato contato) {
		modelo.addRow(new Object[] { contato.getNome(), contato.getTelefone() });
	}
	
	public JLabel getLbNome() {
		return lbNome;
	}

	public void setLbNome(JLabel lbNome) {
		this.lbNome = lbNome;
	}

	public JLabel getLbTelefone() {
		return lbTelefone;
	}

	public void setLbTelefone(JLabel lbTelefone) {
		this.lbTelefone = lbTelefone;
	}

	public JTextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(JTextField tfNome) {
		this.tfNome = tfNome;
	}

	public JTextField getTfTelefone() {
		return tfTelefone;
	}

	public void setTfTelefone(JTextField tfTelefone) {
		this.tfTelefone = tfTelefone;
	}

	public JButton getBtCadastrar() {
		return btCadastrar;
	}

	public void setBtCadastrar(JButton btCadastrar) {
		this.btCadastrar = btCadastrar;
	}

	public JScrollPane getBarraRolagem() {
		return barraRolagem;
	}

	public void setBarraRolagem(JScrollPane barraRolagem) {
		this.barraRolagem = barraRolagem;
	}

	public JTable getTabela() {
		return tabela;
	}

	public void setTabela(JTable tabela) {
		this.tabela = tabela;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
