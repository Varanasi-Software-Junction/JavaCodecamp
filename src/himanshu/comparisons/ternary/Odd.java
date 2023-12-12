package himanshu.comparisons.ternary;

import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {
        int a;
        System.out.println("enter the no ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
//        System.out.println("if  b is printed than no is not odd ");

        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

    }
}
