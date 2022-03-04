// package stack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;



public class BankAccount{
    static int accno=0;
    int balance,accountno;
    String name;
    static int AC=0;
    static int roi=6;
    //int a=0;

    BankAccount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        this.name=sc.next();
        System.out.println("Initial deposit amount: ");
        this.balance=sc.nextInt();
        accountno=++accno;


    }
        public static void main(String args[])
    {
        //BankAccount a=new BankAccount("Shivank",10000);
        
        
        //a.deposit();
        //System.out.println(a);
        //a.withdraw();
        //System.out.println(a);
        BankAccount data[]=new BankAccount[10];
        //BankAccount data[]={new BankAccount("Shyam",11000),
        //new BankAccount("Ship",12000),
        //new BankAccount("punit",14000)};
        Scanner sc= new Scanner(System.in);
        
        

        
        int num=1;
        while(true)
        {
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. Open Account with us: ");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Search");
        System.out.println("5. Search All");
        num=sc.nextInt();
        switch(num)
        {
        case 0:
        {
            System.out.println("Exit....");
            return;
            
            
        }
        case 1:
        {
            //
            System.out.println("Enter Name ");
            String g=sc.next();
            System.out.println("Initial deposit amount: ");
            int c=sc.nextInt();
            //data[AC]=new BankAccount();
            data[AC]=new BankAccount(g,c);
            
            System.out.println(data[AC]);
            AC++;
            //System.out.println(toString());
            break;
        }

        case 2:
        {
        System.out.println("Enter account no for deposit: ");
        int acno=sc.nextInt();
        if(acno<0 || acno>data.length-1 || data[acno-1]==null)
        System.out.println("Account Not found");    
        else{
        System.out.println(data[acno-1]);
         data[acno-1].deposit();}
         break;
        }
        case 3:
        {
        System.out.println("Enter account no for withdrawl: ");
        int acno=sc.nextInt();
        if(acno<0 || acno>data.length-1 || data[acno-1]==null)
        System.out.println("Account Not found");
        else {
        System.out.println(data[acno-1]);
         data[acno-1].withdraw();}
         break;
        }
        case 4:
        {
            System.out.println("Search by Entering account no: ");
            int acno=sc.nextInt();
            if(acno<0 || acno>AC)
            System.out.println("Account Not found");
            else
            System.out.println(data[acno-1]);
            break;
        }
        case 5:
        {
            for(int i=0;i<AC;i++)
            {
                
            System.out.println(data[i]);}
            break;
        }
        default:
        {
            System.out.println("Invalid input");
            break;
        }
    }
        //String q=sc.next();
        //System.out.println("Enter ");
        
        
        //data[i]=new BankAccount(q, g);
        //}
        //System.out.println(data[2]);
        //}

    }
        
}

    BankAccount(String name,int balance)
    {
        this.name=name;
        this.accountno=++accno;
        this.balance=balance;
    }
    public String toString()
    {
   return " Name: "+name + "\n Account NUmber: " + accountno + "\n Balance: " + balance+"\n";
} 
    public void deposit()
    {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Enter a sum to deposit: ");
        int add=sc.nextInt();
        //sc.close();
        if(add>0)
        balance+=add;
        System.out.println(toString());//"New Balance "+balance);
    }
    public void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sum to withdraw: ");
        int sub=sc.nextInt();
        //sc.close();
        if(sub>0 && sub<=balance)
        balance-=sub;
        System.out.println(toString());
    }
    
 public static Connection connect()
 {
    try {
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="System";
        String password="wrong";
        Connection connection=DriverManager.getConnection(url,username,password);
        return connection;
        }
    catch(SQLException e){
        System.out.println(e);

    }

 }   

}