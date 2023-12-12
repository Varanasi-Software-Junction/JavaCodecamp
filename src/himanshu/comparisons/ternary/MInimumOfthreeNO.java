


package himanshu.comparisons.ternary;

import java.util.Scanner;


public class MInimumOfthreeNO {
    public static void main(String[] args) {
        int a,b,c;
        
        System.out.println("enter the 3 no:s");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.print("The minimum is ");
        System.out.println((a<=b&& a<=c)? a : (b<=c )? b : c);
        
        
    
             
    }
}
