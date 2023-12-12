


package himanshu.comparisons.ternary;

import java.util.Scanner;


public class Middleofthree {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("entert the three no");
        Scanner sc = new Scanner (System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println((a>=b&&a<=c|| a<=b&&a>=c)?a:(b>=a&&b<= c || b<=a&&b>=c)?b:c);
                
    }

}
