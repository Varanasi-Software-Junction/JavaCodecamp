package himanshu.comparisons;

import java.util.Scanner;

public class Divisiblity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println("the no is divisible by 2");
            } else {
                System.out.println("the no ia not diviaible by 2");
            }
        }
    }
}
