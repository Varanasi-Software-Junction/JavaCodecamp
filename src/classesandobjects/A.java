/*
1-By default java creates a default constructor.Default constructor has no parameters
2-if constructor is made then default constructor is not given
3-calling of constructor in inheritance
4-sub class will always call the super class constructor Default constructor can be called automatically
5-sub class constructor calls super class constructor up the chains
 */
package classesandobjects;
public class A {
    A()
    {
        System.out.println("0 constructor A");    
    }
    public static void main(String[] args) {
    new C();
    }    
    }

class B extends A
{
   B(int x)
   {
       System.out.println("1 constructor B");
   }
}
class C extends B
{
   C()
   {
     super(9);
       System.out.println("0 constructor C");
   }
}