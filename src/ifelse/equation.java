package ifelse;
import java.util.Scanner;
public class equation {
public static void main (String[] args ){
 int a,b,c;   
 Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a");
       a = sc.nextInt();

      System.out.println("Enter the value of b");
       b = sc.nextInt();

      System.out.println("Enter the value of c");
       c = sc.nextInt();
       
       double d=b*b-4*a*c;
       if(d>=0)
       {
       d=Math.sqrt(d);
       double x1=(-b + d)/(2*a);
       double x2=(-b -d)/(2*a);
       System.out.println("x1 = " + x1 + ", x2 = " + x2);
       }
       else
       {
           d=Math.sqrt(-d);
           double realpart=b/(2*a);
           double imagpart=d/(2*a);
           System.out.println("Real Part = " + realpart + ", Imag Part = " + imagpart);
       }

}
     

     
      }
   
    
    
    
    

