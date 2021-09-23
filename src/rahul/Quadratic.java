package rahul;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        double d=b*b - 4*a*c;
        d=Math.sqrt(d);
        double x1=(-b + d)/(2*a);
        double x2=(-b - d)/(2*a);
        System.out.println(x1);
        System.out.println(x2);
        
    }
    
}
