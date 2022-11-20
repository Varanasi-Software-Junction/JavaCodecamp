package dynamicprogramming;

import java.util.ArrayList;

public class FibonacciDP {

    static int count = 0;
    static ArrayList<Integer> fibs = new ArrayList<>();

    static int fibDP(int n) {
        //System.err.println(n);
        if (n <= fibs.size()) {
            return fibs.get(n - 1);
        }
        count++;
        if (n == 1) {

            return 0;
        }
        if (n == 2) {

            return 1;
        }
        int result = fibDP(n - 1) + fibDP(n - 2);
        fibs.add(result);
        return result;

    }

    static int fib(int n) {
        count++;
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
       for(int n =1;n<= 10;n++)
       {
        fibs.clear();
        count=0;
        int result = fib(n);
           System.out.println(n);
        System.out.println(result + " : " + count);
        count = 0;
        fibs.add(0);
        fibs.add(1);
        result = fibDP(n);
        System.out.println(result + " : " + count);
        System.out.println(fibs);
       }
    }
}
