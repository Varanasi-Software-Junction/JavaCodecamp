
package test;

public class Factorial {
    public static int factorial(int n) throws Exception
    {
        if (n<0)
            throw new Exception("Negative numbers don't have factorial " + n);
        if (n==0)
            return 1;
                    return n* factorial(n-1);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(factorial(4));
    }
}
