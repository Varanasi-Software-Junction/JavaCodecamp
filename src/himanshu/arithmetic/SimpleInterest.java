package himanshu.arithmetic;

import java.util.*;

public class SimpleInterest {

    public static void main(String[] args) {
        System.out.println("Enter P,R and T");
        Scanner s = new Scanner(System.in);
        int p = s.nextInt(), r = s.nextInt(), t = s.nextInt();
        double si = (p * r * t) / 100.0;

        System.out.println("the value of interest = " + si);

    }
}
