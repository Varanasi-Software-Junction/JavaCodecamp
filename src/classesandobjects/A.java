
package classesandobjects;
/*
1. By default Java creates a default constructor. Default constructor has no parameters
2. If constructor is made then default onstructor is not given
3. Calling of constructors in inheritance
4. Sub class will always call the super class constructor. Default constructors can be called automatically
5. Sub class constructor calls super class constructo up the chain
*/
public class A {
       A()
       {
           System.out.println("0 Constructor A");
       }
    
    public static void main(String[] args) {
    
        new C();
    }
}

class B extends A
{
      
        B(int x)
       {
           System.out.println("1 Constructor B");
       }
}
class C extends B
{
       C()
       {
         super(9);
           System.out.println("0 Constructor C");
       }
}


