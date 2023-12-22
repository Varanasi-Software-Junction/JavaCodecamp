package himanshu.switchs;

import java.util.Scanner;

public class Triangleswitch {

    public static void main(String[] args) {
        System.out.println("Enter side of triangle ");
        int a = (new Scanner(System.in).nextInt());
        int b = (new Scanner(System.in).nextInt());
        int c = (new Scanner(System.in).nextInt());
        int n = 0;
        switch (a - b) {
            case 0:
                n++;
                System.out.println(n);
                break;

            default:
                switch (a - c) {
                    case 0:
                        n++;
                        System.out.println(n);
                        break;
                    default:
                        System.out.println("The ");
                }
        }
    }

}
