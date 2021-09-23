package banking;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class DatabaseUtilities {
    public static void main(String[] args) {
        
    }
    public static int getAccountno()
    {
        try
        {
            Statement statement=getConnection().createStatement();
            ResultSet rs=statement.executeQuery("select max(bankaccountno) from bank");
            rs.next();
            return Integer.parseInt(""+rs.getObject(1));
        }
        
            catch(Exception e)
        {
            System.out.println(e);
            return -1;
        
            
        }
    }
    public static Connection getConnection()
    {
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="system";
        String password="password";
        Connection connection=DriverManager.getConnection(url,user,password);
            return connection;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    }

    
