package ifelse;
import java.util.Scanner;
public class angled {
public static void main (String[] args ){
    int x,y,z;
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of x");
       x = sc.nextInt();

      System.out.println("Enter the value of y");
       y = sc.nextInt();

      System.out.println("Enter the value of z");
       z = sc.nextInt();
{
     int t;
     if(x>z)
     {
         t=x;
         x=z;
         z=t;
     }
     if(y>z)
     {
         t=y;
         y=z;
         z=t;
     }
{
 if(x*x + y*y == z*z)
 {
     System.out.println("Rt angled");
 }
    
    if (x == y && y == z )
        System.out.println("Equilateral Triangle");
 
    else if (x == y || y == z || z == x )
        System.out.println("Isoceles Triangle");
 

    else
        System.out.println("Scalene Triangle");
}
 

     
}
}
    
}
