package chandanbhaiyyapackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Bank {
    static int accNo=0;
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="System";
        String password="wrong";
        Connection connection=DriverManager.getConnection(url,user,password);
        while(true)
        {
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. Open Account with us: ");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Search");
        //System.out.println("5. Search All");
        int num=sc.nextInt();
        
            switch (num) {
                case 0:
                {System.out.println("Exit....");
                return;}
                case 1:
                { 
                    ++accNo;
                    System.out.println("Enter Name ");
                    String g=sc.next();
                    System.out.println("Initial deposit amount: ");
                    int c=sc.nextInt();
                    System.out.println("Thank YOu!!!....Account Opened "+accNo+" is your account number");
                    PreparedStatement statement = connection.prepareStatement("insert into Bank values(?,?,?)");

                    statement.setString(1,"" + accNo);
                    statement.setString(2, g);
                    statement.setString(3,"" + c);

                    
                    int n = statement.executeUpdate();
                    System.out.println(n+" record inserted");

                  
                    break;
                }
                case 2:
                {
                    System.out.println("Enter a sum to withdraw: ");
                    int sub=sc.nextInt();

                    break; 
                }
                case 3:
                {
                    System.out.println("Enter account no for withdrawl: ");
                    int acno=sc.nextInt();

                }
                case 4:
                {
                    System.out.println("Search by Entering account no: ");
                    int acno=sc.nextInt();
                    break;
                }
                    
                   
            
                default:
                    break;
            }
        }}
        
        
    }
    

