package himanshu.switchs;

import java.util.Scanner;

public class reverseoffibnossics {

    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int term = (new Scanner(System.in).nextInt());
        for (int i = 1; i <= term; i++) {
            System.out.println(a);
            c = a - b;
            a = b;
            b = c;

        }
    }

}
