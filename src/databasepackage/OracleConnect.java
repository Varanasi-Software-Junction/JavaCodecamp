package databasepackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
//import java.sql.*;

public class OracleConnect {

    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        
        String user = "system";
        String password = "password";
        Connection connection = DriverManager.getConnection(url, user, password);
        //Statement statement = connection.createStatement();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("......Menu......");
            System.out.println("1. Insert Record");
            System.out.println("2. Delete Record");
            System.out.println("3. Update Record");
            System.out.println("Enter choice: ");
            int ch=sc.nextInt();
         if(ch==1)
         {
        
        System.out.println("Enter BookName: ");
        String bookname = sc.nextLine();
         System.out.println("Enter Price: ");
        String price = sc.nextLine();
         System.out.println("Enter Id: ");
        String id = sc.nextLine();
        //statement.execute("insert into books values('7','" + bookname + "','Macmilan','James Gosling','500','2015')");
PreparedStatement statement=connection.prepareStatement("insert into books values(?,?,?)");
statement.setString(1, id);
statement.setString(2, bookname);
statement.setString(3, price);
int n=statement.executeUpdate();
        System.out.println(n + " records inserted.");
         }
         if(ch==2)
         {
         System.out.println("Enter bookID to delete: ");
         int s=sc.nextInt();
         PreparedStatement statement=connection.prepareStatement("delete from books where bookid='"+s+"' ");
         }
         if(ch==3)
         {
         System.out.println("");
         
         }
        System.out.println(connection);}
    }
}
