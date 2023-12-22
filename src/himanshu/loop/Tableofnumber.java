package himanshu.loop;

import java.util.Scanner;

public class Tableofnumber {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number = (new Scanner(System.in).nextInt());

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%4dx%4d=%4d\n", number, i, number * i);

        }

    }

}
