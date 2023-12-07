package himanshu.comparisons;

import java.util.Scanner;

/*
Leap Year rules

Year    div by 400      div by 4    div by 100      Result
2000        Y               Y         Y                Y
2023        N               N         N                N
2020        N               Y         N                Y
1900        N               Y         Y                N
 */
public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter the year");
        int year = (new Scanner(System.in)).nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
