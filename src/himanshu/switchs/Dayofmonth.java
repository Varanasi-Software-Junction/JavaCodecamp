


package himanshu.switchs;

import java.util.Scanner;


public class Dayofmonth {
    
    public static void main(String[] args) {
        System.out.println("Enter the month");
        int month = (new Scanner(System.in).nextInt());
        switch(month){
            case 1 :
                System.out.println("jan= 30 days");
                break;
            case 2 :
                System.out.println("Feb = 28");
                break;
            case 3 :
                System.out.println("march = 30");
                break;
            case 4 :
                System.out.println("April = 31");
                break;
                       
            case 5 :
                System.out.println("May = 30");
                break;
            case 6 :
                System.out.println("jun = 30");
                break;
                
            case 7 :
                System.out.println("july= 30");
                break;
                
            case 8:
                System.out.println("August= 31");
                break;
            case 9 :
                System.out.println("Sep= 30");
                break;
            case 10 :
                System.out.println("Oct = 31");
                break;
            case 11 :
                System.out.println("Nov = 30");
                break;
                
                
            case 12 :
                System.out.println("DEC= 31");
                break;
            default :
                System.out.println("you have enter the invalid month");
                
                
        }
    }

}
