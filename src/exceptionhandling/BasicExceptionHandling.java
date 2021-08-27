
package exceptionhandling;


public class BasicExceptionHandling {
    public static void main(String[] args) {
        try
        {
        int [] a=new int[2];
        System.out.println(a[1]);
        int n=12/0;
        
            System.out.println("Program Done");
        }
        catch(Exception ex)
        {
            System.out.println("Exception " + ex);
        }
        //Single Exception Block
    }
}
