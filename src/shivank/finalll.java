//package shivank;
class finalll
{
    public void f1()
    {
        System.out.println("f1 in finalll");
        
    }
    
}
class nex extends finalll
{
   @Override
    public void f1()
    {
        System.out.println("f1 in nex");
        
    }
    public static void main(String args[])
    {
       
        finalll ob=new nex();
        ob.f1();
         //int a=5;
        //a=6;
        //System.out.println(a);
        
       // nex obj=new finalll();
        //obj.f1();
        
    }
}