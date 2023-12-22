


package himanshu.switchs;

import java.util.Scanner;


public class Digittoone {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number = (new Scanner (System.in).nextInt());
        switch(number){
           
            case 0 :
                System.out.println("THE number 0 = Zero");
                break;
            case 1 :
                System.out.println("THE number 1 = One");
                break;
            case 2 :
                System.out.println("THE number 2 = Two");
                break;
            case 3 :
                System.out.println("The number 3 = THREE");
                break;
            case 4  :
                System.out.println("The number 4 = Four");
                break;
            case 5 :
                System.out.println("The number 5 = Five ");
                break;
            case 6 :
                System.out.println("THe number 6 = Six");
                break;
            case 7 :
                System.out.println("THe number 7 = Seven");
                break;
            case 8 :
                System.out.println("THE Number 8 = Eight");
                break;
            case 9 :
                System.out.println("THE Number 9 = Nine");
                break;
            default :
                System.out.println("you have enter the wrong number");
           
                    
                
        }
        
    }

}
