package himanshu.comparisons.ifelse;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        int rs;
        int ps;
        System.out.println("enter the currency");
        Scanner sc = new Scanner(System.in);
        rs = sc.nextInt();

        ps = sc.nextInt();
        int totalpaise = 100 * rs + ps;
        ps = totalpaise % 100;
        rs = totalpaise / 100;
        System.out.printf("Rs %s.%s\n", rs, ps);

    }
}
