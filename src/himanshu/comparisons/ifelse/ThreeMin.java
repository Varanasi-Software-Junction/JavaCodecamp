package himanshu.comparisons.ifelse;

import java.util.Scanner;

public class ThreeMin {

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("enter the three numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a <= b && a <= c) {
            System.out.println("a is the smallest" + a);
        } else {
            if (b <= c) {
                System.out.println("b is the smallest");
            } else {
                System.out.println("c is the smallest" + c);
            }
        }

    }

}
