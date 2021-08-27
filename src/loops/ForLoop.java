package loops;
public class ForLoop {
    static int i;
    static void initialize()
    {
        System.out.println("Initialize");
        i=1;
    }
    static boolean condition()
    {
        boolean b=i<=5;
        System.out.println("Condition " + b);
        return b;
    }
      static void increment()
    {
        
        System.out.println("increment ");
        i++;
    }
    public static void main(String[] args) {
        
        
        
        
     for(initialize()/*Initialiaze*/; condition() /*Condition*/;increment() /*incr/decr*/)
            System.out.println("body " + i);//Body of the loop
            
        /*
        1. init -1
        2. condition if true goto 3 else goto 5
        3. body
        4. incr back to 2
        5. loop ends
        
        
        
        */
        for(int i=1,j=1;i<=6;i++,j++,System.out.println(i*j))
        { 
            System.out.println(i);
        
        }
    }
}
