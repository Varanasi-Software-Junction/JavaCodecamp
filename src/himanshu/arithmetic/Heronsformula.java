package himanshu.arithmetic;

import java.util.*;

public class Heronsformula {

    public static void main(String arg[]) {
        int a, b, c;
        System.out.println("enter the value of side a,b,c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("area of triangle = " + area);
    }
}
