
package javacodecamp;
public class outlinediagonal {
    public static void main(String[] args) {
        int n=7;
        int mid=(n+1)/2;
        {
        for(int row=1;row<=n;row++)
        {
        for(int col=1;col<=n;col++)
        {
        
         boolean condition= row+col==mid+1  ;
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
    
    
