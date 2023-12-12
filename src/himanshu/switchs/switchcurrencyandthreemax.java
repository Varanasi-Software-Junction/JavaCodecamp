


package himanshu.switchs;

import java.util.Scanner;


public class switchcurrencyandthreemax {
    public static void main(String[] args) {
        System.out.println("enter the currency");
        int a = (new Scanner (System.in)).nextInt();
        System.out.println("enter the choice /n for rupess chice  1 /n for paisha choice 2  ");
        int d =(new Scanner(System.in)).nextInt();
        switch (d){
            case 1:
                System.out.println("the rupees is =");
                a=a*100;
                System.out.println("the paisha is ="+a);
                break;
            case 2:
                System.out.println("paisha is =");
                a=a/100;
                System.out.println("THe paisha is ="+a);
                break;
            default :
                System.out.println("out of the range");
                break ;
        }
        
              
               
                        
        }
                
    
}
