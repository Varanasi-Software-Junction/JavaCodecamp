package exceptionhandling.exceptionhandlingdemo;

/*
try, catch,finally, throw, throws

 */
public class TryCatchDemo {

    public static void main(String[] args) {
        try {
            int n = 0;
            n = 1 / n;
            System.out.println(n);

        } catch (Exception ex) {
            System.out.println(ex);

        } finally {
            System.out.println("Bye");
        }
    }
}
