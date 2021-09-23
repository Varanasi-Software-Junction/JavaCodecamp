package classandobjects;
class StaticClass
{
    StaticClass()
        {
            System.out.println("Constructor");
        }


    public static void main(String args[])
    {
        new StaticClass();
        new StaticClass();
    }
    
    static {
System.out.println("Static 1");
        
    }
    static {//static block
        System.out.println("Static 2");
                
            }
            {//object block
                System.out.println("Object 1");
            }
            {
                System.out.println("Object 2");
            }
        
}
