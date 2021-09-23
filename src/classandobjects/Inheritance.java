package classandobjects;

public class Inheritance {
    public static void main(String[] args) {
       A x1=new A(2) ;
       System.out.println(x1);
       B x2=new B(3,4);
       System.out.println(x2);
       
    }
}
class B extends A //B is derived or sub class, A is super or base class
{
    int b;
    public B(int a,int b)
    {
        super(a);//Calling constructor of the super class. Must be the 1st statement
        this.b=b;
        f1();
    }
    public void f10()
    {
        System.out.println( "F1 in class B");
    }
    @Override
    public String toString()
    {
        return super.toString() + ",B=" + b;
    }
}
class A
{
    int a;//Class Member Variable
    public A(int a/*Parameter */)//Constructor
    {
this.a=a;

    }
    public void f1()
    {
        System.out.println( "F1 in class A");
    }
    public String toString()//Class Method
    {
        return "A= " + a;
    }
}
