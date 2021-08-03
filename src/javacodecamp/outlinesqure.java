
package javacodecamp;
public class outlinesqure {
public static void main(String[] args) {
    int n=7;
    {
        for(int row=1;row<=n;row++)
        {
        for(int col=1;col<=n;col++)
         {
        
         boolean condition= row==1 || col==1 || row==n || col==n  ;
           if(condition)       
         System.out.print("*");
           else
          System.out.print(" ");
            }      
            System.out.println();   
        
        }    
    
    
    }
        
    }
    
    
}
