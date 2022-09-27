package exceptionhandling.exceptionhandlingdemo;

public class ExceptionTransfer {

    public static void f1() {
        f2();
        System.out.println("F1");

    }

    public static void f2() {

        f3();
        System.out.println("F2");
    }

    public static void f3() {

        System.out.println("F3");
        int n = 0;
        n = n / n;

    }

    public static void main(String[] args) {
        try {
            f1();
        } catch (Exception ex) {
            System.out.println(ex + " in main");
        }

    }
}
