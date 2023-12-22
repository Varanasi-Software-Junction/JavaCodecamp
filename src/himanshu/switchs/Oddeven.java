


package himanshu.switchs;

import java.util.Scanner;


public class Oddeven {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        int number = ( new Scanner (System.in).nextInt());
        switch(number%2){
            case 0 :
               System.out.println("Number is even="+number);
               break;
            default :
                System.out.println("Number is  odd ="+number);
                break;
        }
    }

}
