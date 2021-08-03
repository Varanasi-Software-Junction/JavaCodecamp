
package switchpackage;
import java.util.Scanner;


public class SwitchLeapyear {
    public static void main(String[] args) {
    int n=(new Scanner(System.in)).nextInt();
    switch(n % 400)
    {
     case 0:
         System.out.println( "Leap Year");
         break;
         default:
             
             switch(n % 4)
             {
                 default:
                    System.out.println( "LNot eap Year");
                    break;
                 case 0:
                     switch( n % 100)
                     {
                         case 0:
                             System.out.println( "Not Leap Year");
                             break;
                             default:
                                 System.out.println( "Leap Year");
                                 break;
                     }
                     
                     break;      
                 
                 
                 
             }
             
             
             
           break;
    
    }
    
    }
    
    }