package exceptionhandling;
public class MultipleExceptionBlock{ 
    public static void main(String[] args) {
        try
        {
            int marks=109;
            if (marks>100)
         throw  new MarksException();//Thrpwing out own exception
   //throw new NullPointerException("Some Data");//Throwing an Exception
     int [] a=new int[20];
    System.out.println(a[12]);
     int n=12/10;

       System.out.println("Program Done");
        }
        catch(MarksException ex)//Catching our own exception
        {
            System.out.println("Marks Problem " + ex);
        }
        catch(ArithmeticException ex)//Only for arithmetic exception
        {
            System.out.println("Arithmetic Problem " + ex);
        }

        catch(ArrayIndexOutOfBoundsException ex)//Only for ArrayIndex problems
        {
            System.out.println("Array Problem " + ex);
        }

        finally
        {
            System.out.println("Finally. Will run always Exception or no exception");
        }
        //Multiple Exception Block
    }
    
}
