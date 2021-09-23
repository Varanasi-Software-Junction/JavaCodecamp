
package banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankAccount {
    String name;
    int accountno,amount;
    public BankAccount(int accountno)throws Exception
    {
        
       Connection connection=DatabaseUtilities.getConnection();
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
