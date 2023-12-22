


package himanshu.switchs;

import java.util.Scanner;


public class Marksanddivision {
    public static void main(String[] args) {
        System.out.println("Enter the number");
int number = (new Scanner (System.in).nextInt())  ;

switch(number/10){
    case 0 :
        System.out.println("you are fail");
        break;
       
    case 4 :
        System.out.println("you third");
        break;
    case 5 :
        System.out.println("you are second");
        break;
    case 6 :
        System.out.println("you are first");
        break;
    default :
        System.out.println("you are fail");
    
        }
        
        
}
        
        
        
        
    }

