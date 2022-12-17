package oopsday;

public class Test {

    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        A a = new A();
        System.out.println(c.getClass());
        System.out.println(b.getClass());
        System.out.println(a.getClass());
        System.out.println(c.getClass().getSuperclass());
        System.out.println(b.getClass().getSuperclass());
        System.out.println(a.getClass().getSuperclass());
        System.out.println(a.getClass().getSuperclass().getSuperclass());
//        System.out.println(a.getClass().getSuperclass().getSuperclass().getSuperclass());
//The java.lang.Object class is the super class of all Java classes
    }
}
//if a class has no constructor Java creates a zero parameter constructor for it.
// If we make a constructor then this is not provided
/*
Sub class constructor must call the super class constructor.
If zero parameter constructor exists then it is called automatically
Otherwise super is needed.
 */
