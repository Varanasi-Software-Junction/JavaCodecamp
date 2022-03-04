package dbpackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class DBConfig {
    
     public static String getTabl(PreparedStatement statement) throws SQLException
    {
        
        String output="<table class='table-striped table-hover table-responsive' >\n";
        ResultSet rs=statement.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
        int n= rsmd.getColumnCount();
        output+="\n<tr>";
            for(int i=1;i<=n;i++)
                output+="<th>" +"  "+ rsmd.getColumnLabel(i)+"  "+ "</th>";
            output+="</tr>\n";
         boolean ans=false;
        while(rs.next())
        {
            ans=true;
            output+="\n<tr>";
            for(int i=1;i<=n;i++)
                output+="<td>" + rs.getObject(i) + "</td>";
            output+="</tr>\n";
                
        }
        output+="</table>\n";
        if(ans==true)
        return output;
        else
            return null;
        
    }
    
    
    public static String getTabl(String query) throws SQLException
    {
        Connection connection=getConnection();
        PreparedStatement statement=connection.prepareStatement(query);
        String output=getTabl(statement);
        return output;
        
    }
    
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

    

