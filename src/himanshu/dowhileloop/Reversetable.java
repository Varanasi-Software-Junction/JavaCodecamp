


package himanshu.dowhileloop;

import java.util.Scanner;


public class Reversetable {
    public static void main(String[] args) {
        System.out.println("Entr the Table You want to show Reverse ");
        int c = (new Scanner (System.in).nextInt());
       
        int i= 10 ;
       
        do{
            int k  = c*i;
            System.out.println(k);
            
            i--;
            
        }
        
        while(i>0);
        
               
    }
            

}
