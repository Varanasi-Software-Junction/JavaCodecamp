/*
 * To differentiate between a local variable(inside a function) and a class variable
 * To get a reference to the object inside a class
 * To call a different constructor of the same class
Triangle() 0,0,0
Triangle(1) 1,1,1
Triangle(1,2) 1,2,2
 */
package classesandobjects;

public class UseOfThis {
    String x;
    public void f1()
    {
        String x;
        x="Local";
        this.x="Global";
        System.out.println(x);
        System.out.println(this.x);
    }
    public UseOfThis()
    {
        this(1);
        System.out.println("0 parameter constructor");
    }
    public UseOfThis(int a)
    {
        this(1,2);
        System.out.println("1 parameter constructor");
    }
    public UseOfThis(int a,int b)
    {
        System.out.println("2 parameter constructor");
    }
    public UseOfThis f()
    {
        System.out.println(this);
        return this;
    }
    public String toString()
    {
        return "Use of This";
    }
    public static void main(String[] args) {
     //   new UseOfThis();
     //   new UseOfThis(1);
      UseOfThis uot=  new UseOfThis(1,2);
      uot.f1();
        System.out.println(uot);
        uot.f();
        System.out.println(uot ==uot.f() );
    }
}
