package conexao;

import java.sql.*;

public class ModuloConexao {
    
     public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/usuarios";
        String user ="root";
        String password = "admin1233";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
    
}
