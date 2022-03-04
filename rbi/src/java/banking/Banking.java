package banking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Banking{
    //static int accNo=0;
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        Connection connection=Database.getConnection();
        while(true)
        {
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. Open Account with us: ");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Search");
        //System.out.println("5. Search All");
        int num=Integer.parseInt( sc.nextLine());
        
            switch (num) {
                case 0:
                {System.out.println("Exit....");
                return;}
                case 1:
                { 
                    //++accNo;
                    System.out.println("Enter Name ");
                    String g=sc.nextLine();
                    System.out.println("Initial deposit amount: ");
                    int c=Integer.parseInt( sc.nextLine());
                    
                    
                    
                    PreparedStatement statement = connection.prepareStatement("insert into Bank values(bankaccountnumber.nextval,?,?)");

                    //statement.setInt(1, accNo);
                    statement.setString(1, g);
                    statement.setString(2, "" + c);
                    int n = statement.executeUpdate();
                    int accNo=Database.getAccountno();
                    System.out.println("Thank YOu!!!....Account Opened "+accNo+" is your account number");
                    
                    System.out.println(n+" record inserted");

                  
                    break;
                }
                case 3:
                {
                    System.out.println("Enter account Number for withdrawl: ");
                    int acc= Integer.parseInt( sc.nextLine());
                    PreparedStatement statement = connection.prepareStatement("select bankaccountno from Bank where bankaccountno=?");
                    statement.setString(1,"" + acc);
                    ResultSet r=statement.executeQuery();
                    int flag=0;
                    while(r.next())
                    {
                        
                        flag=1;
                        break;
                    }
                    if(flag==0)
                    {System.out.println("Account Not found");
                    break;
                    }
                    System.out.println("Account found");
                    PreparedStatement statement4 = connection.prepareStatement("select amount from bank where bankaccountno=?");
                    statement4.setString(1,"" + acc);
                    ResultSet rs4=statement4.executeQuery();
                    while(rs4.next())
                    {
                    System.out.println("Balance: "+rs4.getObject(1));
                    }
                    
                    System.out.println("Enter a sum to withdraw: ");
                    int sub=Integer.parseInt( sc.nextLine());
                    if(sub<=0)
                    {
                        break;}
                    PreparedStatement statement3 = connection.prepareStatement("select amount from bank where bankaccountno=?");
                    statement3.setString(1,"" + acc);
                    ResultSet rs1=statement3.executeQuery();
                    while(rs1.next())
                    {
                        if(sub>(Integer.parseInt( ""+rs1.getObject(1))))
                        {flag=0;
                            break;}
                        
                    }
                    if(flag==0)
                    {System.out.println("Invalid Amount");
                        break;}
                        
                    PreparedStatement statement1 = connection.prepareStatement("update bank set amount=amount-? where bankaccountno=?");
                    statement1.setString(1,"" + sub);
                    statement1.setString(2,"" + acc);
                    statement1.executeUpdate();
                    System.out.println("Transaction Successfull");
                    PreparedStatement statement2 = connection.prepareStatement("select amount from bank where bankaccountno=?");
                    statement2.setString(1,"" + acc);
                    ResultSet rs=statement2.executeQuery();
                    //ResultSetMetaData rsmd = r.getMetaData();
                    //int n = rsmd.getColumnCount();
                    System.out.print("Balance amount: ");
                    while (rs.next()) {
                    System.out.print(rs.getObject(1));}
                    break; 
                    }
                case 2:
                {
                    System.out.println("Enter account Number for deposit: ");
                    int acc=Integer.parseInt( sc.nextLine());
                    
                    PreparedStatement statement = connection.prepareStatement("select bankaccountno from Bank where bankaccountno=?");
                    statement.setString(1, "" + acc);
                    ResultSet r=statement.executeQuery();
                    int flag=0;
                    while(r.next())
                    {
                        
                        flag=1;
                        break;
                    }
                    if(flag==0)
                    {System.out.println("Account Not found");
                    break;
                    }
                    System.out.println("Account found");

                    
                    System.out.println("Enter a sum to deposit: ");
                    int sub=Integer.parseInt(sc.nextLine());
                    if(sub<=0)
                    {System.out.println("Invalid Amount");
                        break;}
                    PreparedStatement statement3 = connection.prepareStatement("select amount from bank where bankaccountno=?");
                    statement3.setString(1,"" + acc);
                    ResultSet rs1=statement3.executeQuery();
                    while(rs1.next())
                    {
                    System.out.println("Balance: "+rs1.getObject(1));
                    }
                    
                    
                   
                        
                    PreparedStatement statement1 = connection.prepareStatement("update bank set amount=amount+? where bankaccountno=?");
                    statement1.setString(1,"" + sub);
                    statement1.setString(2,"" + acc);
                    statement1.executeUpdate();
                    System.out.println("Transaction Successfull");
                    PreparedStatement statement2 = connection.prepareStatement("select amount from bank where bankaccountno=?");
                    statement2.setString(1,"" + acc);
                    ResultSet rs=statement2.executeQuery();
                    //ResultSetMetaData rsmd = r.getMetaData();
                    //int n = rsmd.getColumnCount();
                    
                    System.out.print("Balance amount: ");
                    while (rs.next()) {
                    System.out.print(rs.getObject(1));}
                    break; 
                }
                
                case 4:
                {
                    System.out.println("Enter account Number: ");
                    int acc=Integer.parseInt( sc.nextLine());
                    PreparedStatement statement = connection.prepareStatement("select bankaccountno from Bank where bankaccountno=?");
                    statement.setString(1,"" + acc);
                    ResultSet r=statement.executeQuery();
                    int flag=0;
                    while(r.next())
                    {
                        
                        flag=1;
                        break;
                    }
                    if(flag==0)
                    {System.out.println("Account Not found");
                    break;
                    }
                    System.out.println("Account found");

                    
                    
                    
                    PreparedStatement statement2 = connection.prepareStatement("select * from bank where bankaccountno=?");
                    statement2.setString(1,""+ acc);
                    ResultSet rs=statement2.executeQuery();
                    //ResultSetMetaData rsmd = r.getMetaData();
                    //int n = rsmd.getColumnCount();
                    
                    ResultSetMetaData rsmd = rs.getMetaData();
        int n = rsmd.getColumnCount();
        for (int i = 1; i <= n; i++) {
          System.out.print(rsmd.getColumnLabel(i) + "\t\t");
        }
        while (rs.next()) {

          System.out.println();
          for (int i = 1; i <= n; i++) {
            System.out.print(rs.getObject(i) + "\t\t");

          }}
                    break; 
        }
                
                    
                   
            
                default:
                    break;
            }
        }
    }
}