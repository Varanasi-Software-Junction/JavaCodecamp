package shivank.shivank;
import access.specifiers;
class checkspecifiers{
    void f3()
    {
    // System.out.println(a);//private not visible
     //System.out.println(b+"*");
     //System.out.println(c+"*");
     //System.out.println(d+"*");

    }
    
    public static void main(String args[])
    {
        specifiers a1= new specifiers();
    // System.out.println(a1.a);//private not visible
     System.out.println(a1.b+"*");//public visible
   //  System.out.println(a1.c+"*"); //protected not visible outside package when super class not extended
   //  System.out.println(a1.d+"*");//package not visible outside package
  
    }
} 
