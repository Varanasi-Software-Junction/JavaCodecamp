package himanshu.switchs;

import java.util.Scanner;

public class Leapyearinswitch {

    public static void main(String[] args) {
        System.out.println("Enter the year ");
        int year = (new Scanner(System.in).nextInt());
        

        switch (year % 400) {
            case 0:
                System.out.println("Leap year");
                break;
            default:
                switch (year % 4) {
                    default:
                        System.out.println("Not Leap year");
                        break;

                    case 0:
                        switch (year % 100) {
                            case 0:
                                System.out.println("Not Leap year");
                                break;
                            default:
                                System.out.println("Leap year");
                                break;
                        }

                        break;
                }

                break;

        }
    }

}
