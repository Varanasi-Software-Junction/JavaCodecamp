package classesandobjects;
public class Triangle {
    int a,b,c;
    public Triangle()
    {
       this(0,0,0);
    }
    public Triangle(int s1)
    {
        this(s1,s1,s1);
        
    }
    public Triangle(int s1,int s2)
    {
        this(s1,s2,s2);
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
        Triangle t=new Triangle();
        Triangle t1=new Triangle(1);
        Triangle t2=new Triangle(1,2);
        Triangle t3=new Triangle(1,2,3);
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
 
    }
}

    
