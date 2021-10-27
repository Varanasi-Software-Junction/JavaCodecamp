
package banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankAccount {
public void update()
{
    try
    {
        PreparedStatement ps=Database.getConnection().prepareStatement("update bank set name=?, amount=? where bankaccountno=?");
        ps.setString(1, name);
        ps.setString(2, "" + amount);
        ps.setString(3, "" + accountno);
        ps.executeUpdate();
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    
    
    
  private String name;

    public BankAccount(String name, int amount) {
        this.name = name;
        this.amount = amount;
        this.accountno=0;
    }
   private int accountno,amount;
    public BankAccount(int accountno)throws Exception
    {
        
       Connection connection=Database.getConnection();
        PreparedStatement ps= connection.prepareStatement("select * from bank where bankaccountno=?");
       ps.setString(1, "" + accountno);
        ResultSet rs=ps.executeQuery();
        if(!rs.next())
            throw new Exception("No record");
        this.name="" + rs.getObject("name");
        this.accountno= Integer.parseInt("" +rs.getObject("bankaccountno"));
        this.amount= Integer.parseInt("" +rs.getObject("amount"));
        
    }

    @Override
    public String toString() {
        return "BankAccount{" + "name=" + name + ", accountno=" + accountno + ", amount=" + amount + '}';
    }
    
    public static void main(String[] args) throws Exception {
        BankAccount account=new BankAccount(3);
        System.out.println(account);
    }
}
