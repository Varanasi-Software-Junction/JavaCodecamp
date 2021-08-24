package classandobjects;

public class StaticAndInstance{
   
    static String staticvariable="static 1";
    String instancevariable = "instance 1";
    public  void f()
    {
        System.out.println(staticvariable);
        System.out.println(instancevariable);
        
    }    
    public static void main(String[] args) {
        System.out.println(StaticAndInstance.staticvariable);
        StaticAndInstance s1=new StaticAndInstance();
        StaticAndInstance s2=new StaticAndInstance();
        System.out.println(s1.instancevariable);
        System.out.println(StaticAndInstance.staticvariable);
        s1.f();
        s2.f();
        StaticAndInstance.staticvariable="stat new";
        s2.instancevariable="instance new";
        s1.f();
        s2.f();
    }
}
 

    

