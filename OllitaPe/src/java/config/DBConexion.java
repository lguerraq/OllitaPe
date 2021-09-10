
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConexion {
    private static Connection conn;
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql://localhost/ollitape", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
