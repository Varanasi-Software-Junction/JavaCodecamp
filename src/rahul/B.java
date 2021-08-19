package rahul;
public class B extends A{
    static 
    {
        System.out.println("Static B-1");
    }
     static 
    {
        System.out.println("Static B-2");
    }
     
    {
        System.out.println("Object B-1");
    }
    {
        System.out.println("Object B-2");
    }
    public B()
    {
        System.out.println("Constructor B");
    }
}
