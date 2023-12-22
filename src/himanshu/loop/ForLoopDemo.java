package himanshu.loop;

public class ForLoopDemo {

    public static void main(String[] args) {
        for (initialize(); condition(); increment()) {
            body();
        }
    }
    static int n;

    static void initialize() {
        System.out.println("Initialize");
        n = 1;
    }

    static boolean condition() {
        System.out.println("Condition");
        return n <= 10;
    }

    static void increment() {
        System.out.println("Increment");
        n++;
    }

    static void body() {
        System.out.println("Body " + n);

    }
}
