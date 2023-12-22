


package himanshu.whileloop;

import java.util.Scanner;
import loops.number;
import static oracle.net.aso.C11.i;


public class Printingnumber7 {
    public static void main(String[] args) {
      int i = 1;
        System.out.println("Enter the number for printing table ");
        int numbr = (new Scanner (System.in).nextInt());
        while( i<=10){
           System.out.printf("%4dx4%dx=%4d/n " numbr,i,numbr*i);
           i++;
        
        }
        
        
    }
            

}
