
package loops;
import java.util.Scanner;
public class Fibonaccireverse {
    public static void main(String[] args) {
   int c = 21, b=13;  
int a=c-b;
while(a>0)
{
        System.out.println(a);
       c=b;
       b=a;
       a=c-b;
}
        System.out.println(a);
}  
}  
    

