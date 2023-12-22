package himanshu.whileloop;

import java.util.Scanner;

public class fibnosisseies {

    public static void main(String[] args) {

        int a = 0, b = 1, c;
        System.out.println("enter the term");
        int term = (new Scanner(System.in).nextInt());
        while (term <= 100) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            term++;
        }

    }

}
