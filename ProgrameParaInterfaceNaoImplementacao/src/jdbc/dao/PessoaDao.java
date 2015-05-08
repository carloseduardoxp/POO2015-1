package jdbc.dao;

import jdbc.domain.Pessoa;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class PessoaDao {
	
	public void salvar(Pessoa pessoa) throws Exception {
		Connection conexao = ConexaoJDBC.getConexao();
		PreparedStatement statement = (PreparedStatement)conexao.prepareStatement("Insert into TPESSOA(nompes) values ?");
		statement.setString(1,pessoa.getNome());
		statement.executeUpdate();
	}
	
	public Pessoa getPessoaId(int codigo) throws Exception {
		Connection conexao = ConexaoJDBC.getConexao();
		PreparedStatement statement = (PreparedStatement)conexao.prepareStatement("Select * from TPESSOA where codpes = ?");
		statement.setInt(1,codigo);
		ResultSet rs = (ResultSet)statement.executeQuery();
		if (rs.next()) {
			Pessoa p = new Pessoa();
			p.setCodigo(codigo);
			p.setNome(rs.getString(2));
			p.setTelefone(rs.getString(3));
		}
		return null;
	}

}
