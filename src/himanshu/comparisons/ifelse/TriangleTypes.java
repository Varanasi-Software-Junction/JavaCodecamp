package himanshu.comparisons.ifelse;

import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of triangles ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b && a==c){
            System.out.println("the trianle is equilaterals");
        }
        else{
          if(a==b && a!=c)  {
              System.out.println("the triangle is isosceles");
          }
          else {
              System.out.println("the triangle is right angled triangle");
              
          }
        }
        
    }
}
