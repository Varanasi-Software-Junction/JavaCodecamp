
package accessmodifiers;


public class A {
    String packagevar="package var";
 public String publicevar="public var";
  private String privatevar="private var";
  protected String protectedvar="protected var";
  void print()
  {
      System.out.println(packagevar);
      System.out.println(publicevar);
      System.out.println(privatevar);
      System.out.println(protectedvar);
  }
    public static void main(String[] args) {
        A a=new A();
        a.print();
    }
}
