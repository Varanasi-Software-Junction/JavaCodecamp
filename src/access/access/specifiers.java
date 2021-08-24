package access;
//in same package , we extend or dont extend ,output remains same, only private is invisble


public class specifiers{
    private String a="Apple";
    public String b="Boy";
    protected String c="Cat";
    String d="Dog";


    void f1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
    
    //public static void main(String args[])
   // {
     //   specifiers ob=new specifiers();
       // ob.f1();
    //}
}
class r { // class in same package not extended,,,, if we dont extend class ,we can access variables through objects
    
    
    //public static void main(String args[])
    {
        
        specifiers ob=new specifiers();
        System.out.println(ob.b);
       // System.out.println(ob.a);// private variable cannot be accessed through objects
        System.out.println(ob.c);
        System.out.println(ob.d);

       
        
    }
}
class e extends specifiers{
    public static void main(String args[])
    {
       e ob=new e();
       ob.f();
    }
    void f()
    {
        // System.out.println(a);// private cannot be accessed even through a extended class
         System.out.println(b+"*");
         System.out.println(c+"*");
         System.out.println(d+"*");
    }
}