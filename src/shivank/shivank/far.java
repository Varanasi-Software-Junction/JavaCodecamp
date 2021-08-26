package shivank;
//outside package, extending superclass after importing "import packagename.classname" will make protected visible.Outside package default/package is not visible.
import access.specifiers;
class far extends specifiers
{
    public static void main(String args[])
    {
         far obj=new far();
         obj.f2();



    }
    void f2()
    { 
     System.out.println(a);//private not visible
     System.out.println(b+"*");//public visible
     System.out.println(c+"*");//protected visible outside package when super class extended
     System.out.println(d+"*");// package not visible too when oustide package 
}}