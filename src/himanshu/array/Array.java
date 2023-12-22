package himanshu.array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int a[] = new  int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < a.length; i++) {
            System.out.println("Enter the number");
            a[i] = sc.nextInt();

        }
        for (i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }

    }
}
