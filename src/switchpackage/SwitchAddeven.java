
package switchpackage;
import java.util.Scanner;

public class SwitchAddeven {
    public static void main(String[] args) {
    int n=(new Scanner(System.in)).nextInt();
    switch(n % 2)
        
    {
         
       case 0: 
           System.out.println("even number");
           break;
          
           default:
               System.out.println("Odd");  
    }
    
    }
}
