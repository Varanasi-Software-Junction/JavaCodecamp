package classandobjects;
class Rectangle
{
    int a,b;
    Rectangle(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    public String toString()
    {
        int area=a*b;
        return "Area is: "+area;
    }
}
class square extends Rectangle{
    
    square(int a)
    {
        super(a,a);

    }
    public static void main(String args[])
    {
        square q=new square(6);
        System.out.println(q);

    }
    public String toString()
    {
        return super.toString();
    }
    
}