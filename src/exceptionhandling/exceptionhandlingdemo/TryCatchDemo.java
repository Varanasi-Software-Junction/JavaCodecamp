package exceptionhandling.exceptionhandlingdemo;

/*
try, catch,finally, throw, throws

 */
public class TryCatchDemo {

    public static void main(String[] args) {
        try {
            int[] a = {9, 3, 4, 5};
            a[0] = 9;
            a[27] = 0;
            int n = 0;
            n = 1 / n;
            System.out.println(n);

        } catch (NullPointerException ex) {
            System.out.println("Null Pointer Exception");
            System.out.println(ex);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception");
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println("Unknown Exception");
            System.out.println(ex);

        } finally {
            System.out.println("Bye");
        }
    }
}
