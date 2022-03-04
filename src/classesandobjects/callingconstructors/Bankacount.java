package classesandobjects.callingconstructors;
import java.util.Scanner;
public class Bankacount {
    String name;
    int acountnumber,balance;
    
    public static void main(String[] args) {
        //Bankacount b1=new Bankacount();
        //System.out.println(b1);
        Bankacount b2=new Bankacount("a",1234,100);
        System.out.println(b2);
        b2.deposit();
        System.out.println(b2);
        b2.bedraw();
        System.out.println(b2);

     
    }
    public void deposit()
    {
        int amount;
      Scanner sc =new Scanner( System.in);   
        System.out.println("Enter amount to deposit");
        amount=sc.nextInt();
        balance+=amount;
    }
    public void bedraw()
    {
     int amount;
      Scanner sc =new Scanner( System.in);   
        System.out.println("Enter amount to bedraw");
         amount=sc.nextInt();
        balance-=amount;
        sc.close();
    
    }
            
     public Bankacount(String name,int acountnumber,int balance)
    {
       this.name=name;
       this.acountnumber=acountnumber;
       this.balance=balance;
    }
    public Bankacount()
    
    {
       System.out.println("Enter name,acountnumber,balance");
       Scanner scanner=new Scanner(System.in);
       this.name=scanner.nextLine();
       this.acountnumber=Integer.parseInt(scanner.nextLine());
       this.balance=Integer.parseInt(scanner.nextLine());
       
       
    }
    @Override
    public String toString() {
   
    return " Name = " + name + ", a.c = " + acountnumber + ", bal = " + balance; 
    }
}

    


    

