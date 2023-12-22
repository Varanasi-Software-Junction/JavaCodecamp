package himanshu.switchs;

import java.util.Scanner;

public class Minofthreeandmax {

    public static void main(String[] args) {
        System.out.println("enter te three no");
        int a = (new Scanner(System.in)).nextInt();
        int b = (new Scanner(System.in)).nextInt();
        int c = (new Scanner(System.in)).nextInt();
        System.out.println("enter the choice /n Enter the =1 for minimum/nEnter 2 for maximum");
        int d = (new Scanner(System.in)).nextInt();
        switch (d) {
            case 1:
                System.out.print("The max no is =");
                System.out.print((a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c);
        
                break;
            case 2:
                System.out.print((a <= b && a <= c) ? a : (b <= a && b <= c) ? b : c);
                System.out.print("the minimum no is =");
                break;

            case 3:
                System.out.print((a >= b && a <= c || a <= b && a >= c) ? a : (b >= a && b <= c || b <= a && b >= c) ? b : c);
                System.out.print("The middle of no is =");
                break;

            default:
                System.out.println("you have chosen the option which is not present");

        }

    }

}
