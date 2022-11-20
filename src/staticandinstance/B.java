package staticandinstance;

public class B extends A {

    static {
        System.out.println("Static block 1 in B");
//        System.out.println("This = " + this); // This is not allowed
    }

    static {
        System.out.println("Static block 2 in B");

    }

    {
        System.out.println("Object block 1 in B");
        System.out.println("This = " + this);
    }

    {
        System.out.println("Object block 2 in B");
    }

    public B() {
        System.out.println("Zero parameter constructor of B");
    }

    public B(Object a) {
        System.out.println("One parameter constructor of B");
    }

    @Override
    public String toString() {
        return "Class B";
    }
    public static void main(String[] args) {
     new B();  
     new B();
    }
}
