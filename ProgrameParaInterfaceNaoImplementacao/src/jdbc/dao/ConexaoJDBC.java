package jdbc.dao;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoJDBC {
	
	public static com.mysql.jdbc.Connection getConexao() throws Exception {
		try {
			Properties parametros = new Properties();
			parametros.load(ConexaoJDBC.class.getResourceAsStream("banco.properties"));
			
			String driver = parametros.getProperty("driver");
			String url = parametros.getProperty("url");
			String login = parametros.getProperty("login");
			String senha = parametros.getProperty("senha");
			
			Class.forName(driver);
	
			com.mysql.jdbc.Connection c =  (com.mysql.jdbc.Connection)DriverManager.getConnection(url, login, senha);
			c.setAutoCommit(false);
	
			return c;
		} catch (ClassNotFoundException e) {
			throw new Exception("Erro: nao consegui encontrar a classe com.mysql.jdbc.Driver: " + e);
		} catch (IOException e) {
			throw new Exception("Erro: nao consegui encontrar o arquivo banco.properties:" + e);
		} catch (SQLException e) {
			throw new Exception("Erro: nao consegui conectar no banco:"+e.getSQLState()+" - " + e);
		}
	}
	
	

}