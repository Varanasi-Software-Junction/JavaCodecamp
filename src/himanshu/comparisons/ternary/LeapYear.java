package himanshu.comparisons.ternary;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        String result = (year % 400 == 0) ? "year is leap " : (year % 4 == 0 && year % 100 != 0) ? "year is leap" : "year is not leap";
        
        System.out.println(result);

    }
}
