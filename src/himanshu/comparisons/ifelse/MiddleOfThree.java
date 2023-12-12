package himanshu.comparisons.ifelse;

import java.util.Scanner;

public class MiddleOfThree {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        int mid;
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            mid = a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            mid = b;
        } else {
            mid = c;
        }
        System.out.println(mid);

    }
}
