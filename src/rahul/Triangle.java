package rahul;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args) {
        //a,b,c
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int x=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        double s=(a+b+c)/2.0;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
        
        
    }
    
}