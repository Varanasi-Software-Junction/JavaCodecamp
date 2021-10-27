/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 *
 * @author rakesh
 */
public class DbConfig {
     public static Connection getConnection() throws SQLException
    {
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="library";
        String password="library";
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        Connection connection=DriverManager.getConnection(url, user, password);
        
        return connection;
    }
}
