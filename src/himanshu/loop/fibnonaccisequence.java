package himanshu.loop;

import static abstractlearn.Ileave.c;
import java.util.Scanner;

public class fibnonaccisequence {

    public static void main(String[] args) {
        int a, b = 21, c = 34;
        a = c - b;
        System.out.print(c + "," + b + ",");
        while (a > 0) {
            System.out.print(a + ",");
            c = b;
            b = a;
            a = c - b;
        }
System.out.println(a + ".");
    }
}
