
package databaseuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleDriver;


public class DatabaseConnect {
    public static void main(String[] args) {
        try {
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            String username="system";
            String password="wrong";
            DriverManager.registerDriver( new OracleDriver());
            Connection connection=DriverManager.getConnection(url, username, password);
            System.out.println(connection);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  
}
