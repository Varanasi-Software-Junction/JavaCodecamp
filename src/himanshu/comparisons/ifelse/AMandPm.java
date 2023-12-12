package himanshu.comparisons.ifelse;

import java.util.Scanner;

public class AMandPm {

    public static void main(String[] args) {

        int hh;
        System.out.println("enter the time");
        Scanner sc = new Scanner(System.in);
        hh = sc.nextInt();
        int mm = sc.nextInt();
        if (hh > 12) {
            hh = hh - 12;
            System.out.printf("%s:%s PM\n", hh, mm);
        } else if (hh == 12) {
            System.out.printf("%s:%s PM\n", hh, mm);
        } else {
            System.out.printf("%s:%s AM\n", hh, mm);
        }

    }
}
