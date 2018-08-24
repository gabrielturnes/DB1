package proj02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ConnectionFactory {
    
    private static final String dbPath = "meubanco.db";
    private static Connection conexao;

    public static Connection getConnection(){
        if(conexao == null){
            try {
                Class.forName("org.sqlite.JDBC");
                conexao = DriverManager.getConnection("jdbc:sqlite:"+ dbPath);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return conexao;
    }
    
}
