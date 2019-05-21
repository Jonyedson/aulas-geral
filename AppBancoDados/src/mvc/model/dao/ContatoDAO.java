package mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mvc.ConnectionFactory;
import mvc.model.vo.Contato;

public class ContatoDAO {
	
	private Connection connection;
	private static ContatoDAO instance;

	private ContatoDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public static ContatoDAO getInstance() {
		if(instance == null) {
			instance = new ContatoDAO();
		}
		return instance;
	}
	
	public void inserir(Contato contato) throws Exception {
		String sql = "INSERT INTO contato (nome, telefone) VALUES(?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());
			stmt.execute();
			stmt.close();
		}catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public List<Contato> getContatos() throws Exception{
		try {
			List<Contato> lista = new ArrayList<>();
			String sql = "SELECT * FROM contato";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Contato contato = new Contato();
				contato.setCodigo(rs.getInt("codigo"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				lista.add(contato);
			}
			rs.close();
			stmt.close();
			return lista;
		}catch(SQLException e) {
			throw new Exception(e);
		}
	}

}
