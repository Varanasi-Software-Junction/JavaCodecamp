
package accessmodifiers;

public class C
{
    void print()
  {
      A a=new A();
      System.out.println(a.packagevar);
      System.out.println(a.publicevar);
    //  System.out.println(privatevar);
      System.out.println(a.protectedvar);
  }
    
}
