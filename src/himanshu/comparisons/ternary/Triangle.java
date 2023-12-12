


package himanshu.comparisons.ternary;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int a ,b,c;
        Scanner sc = new Scanner(System.in);
                System.out.println("enter the number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
       String result = (a==b&&a==c)?" triangle is eqviateral traingle ":(a==b&&a!=c && b!=c)?"trianle is isosclean":"triangle is =iscalen traangle";
       
       System.out.println(result);
       
        
    }
}
