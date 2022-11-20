package staticandinstance;

public class A {

    static {
        System.out.println("Static block 1 in A");
//        System.out.println("This = " + this); // This is not allowed
    }

    static {
        System.out.println("Static block 2 in A");

    }

    {
        System.out.println("Object block 1 in A");
        System.out.println("This = " + this);
    }

    {
        System.out.println("Object block 2 in A");
    }

    public A() {
        System.out.println("Zero parameter constructor of A");
    }

    public A(Object a) {
        System.out.println("One parameter constructor of A");
    }

    @Override
    public String toString() {
        return "Class A";
    }

    public static void main(String[] args) {
        new A();
        new A(0);
    }
}
