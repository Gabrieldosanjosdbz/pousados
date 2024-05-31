package dal;

import java.sql.*;

public class ModuloConexao {
    
    public static Connection conector(){
        Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/pousados"; // Verifique a porta correta e o nome do banco de dados
        String user = "root";
        String password = "24685199";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL não encontrado: " + e.getMessage());
        }
        catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        
        return conexao;
    }
}
