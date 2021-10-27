package stack;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MAPaccount {
    public static void main(String[] args) {
        Map<Integer,BankAccount> m=new TreeMap<>();
        
        //int a[]={222,333,444,555,666};
        //b1.getAccountNo();
       // for(int i=0;i<a.length;i++)
        //{
            while(true)
           {
               BankAccount b1=new BankAccount();
           m.put(b1.accountno,b1);
        if(b1.accountno==4)
        break;

        }
           System.out.println(m);

           System.out.println("Enter account no: ");
           Scanner sc=new Scanner(System.in);
           int s=sc.nextInt();
           System.out.println(m.get(s));


//            m.put(i, b1);
  //      }

        //System.out.println(m.values());
        
    }
    
}
