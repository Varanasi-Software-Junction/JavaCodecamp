
package javacodecamp;

public class rightlowertraingle {
public static void main(String[] args) {
     int n=7;
    {
        for(int row=1;row<=n;row++)
        {
        for(int col=1;col<=n;col++)
         {
        
         boolean condition= row+col>=n+1 ;
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
