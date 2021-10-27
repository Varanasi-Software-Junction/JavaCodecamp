package shivank;
//inner class concepts
//static inner class

//points to remember------
//inner class is created to solve a particular issue inside a class,inner class contains things which are not required outside class, also inner class can mkae use of private variables ,methods of outer class
// inner class can be static or instance
// if inner class is instance, object of outer class need to be created inorder to create object of inner class, in case of static inner class this is not required.
//outer class cannot be static

public class staticclass{
    String name;
    String city;
    

    staticclass(String name,String city)
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
        staticclass a=new staticclass("shivank","Lahore");
        System.out.println(a);
        //a.city();
        staticclass.inner a1=new staticclass.inner();
      //  inner a1=new inner();
        //a1.check();
        System.out.println(a1);
        
    }
    
    @Override
    public String toString()
    {
        return name+" "+city;
    }
    public static class inner{
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
        staticclass q=new staticclass("Shyam", "Braj");
        return q.name+" "+q.city+" "+add(2,5);
    }

       
}}