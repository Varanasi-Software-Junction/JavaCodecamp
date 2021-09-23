package classandobjects;
public class Triangle{
    int a,b,c;
    public Triangle()
    {
        
        this(0,0,0);


    }
    public Triangle(int a)
    {
        
        this(a,a,a);
    }
    public Triangle(int a,int b)
    {
        this(a,b,b);
    }
    public Triangle(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    
    public Triangle toring()
    { 
        System.out.println(this);
         return this;

    }
    public String toString()
    {
    return a+" "+ b+" "+c;
    }
    public static void main(String args[])
    {
        Triangle o=new Triangle();
        Triangle o1=new Triangle(1);
        Triangle o2=new Triangle(1,9);
        
       // System.out.println(o);
        //System.out.println(o1);
        //System.out.println(o2);
        o1.toring();


        o.toring();

        

    }
}
