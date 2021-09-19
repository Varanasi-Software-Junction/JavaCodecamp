package shivank;
//inner class concepts
//non static inner class
public class outer{
    String name;
    String city;
    

    outer(String name,String city)
    {
        this.name=name;
        this.city=city;
    }
    public String city()
    {
        return city;
    } 
    public static void main(String args[])
    {
        outer a=new outer("shivank","Lahore");
        System.out.println(a);
        //a.city();
        outer.inner a1=a.new inner();
      //  inner a1=new inner();
        //a1.check();
        System.out.println(a1);
        
    }
    @Override
    public String toString()
    {
        return name+" "+city;
    }
    public class inner{
        inner()
        {

        }
        public int add(int a,int b)
        {
            return a+b;
        }
        
    @Override
    public String toString()
    {
        return name+" "+city+" "+add(2,5);
    }

       
}}