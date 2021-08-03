
package loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=10;
        System.out.print(a + "," + b );
        for (int i = 3; i <= n; i++)
        {
            int c = a+b;
            a=b;
            b=c;
            System.out.print("," + c);
        
        }
        System.out.println();
    }
   
    
}
