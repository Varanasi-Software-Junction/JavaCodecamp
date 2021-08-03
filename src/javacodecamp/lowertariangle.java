
package javacodecamp;

public class lowertariangle {
public static void main(String[] args) {
    int n=5;
    for(int row=1;row<=n;row++)
    {
    for (int col=1;col<=n;col++)
    {
        boolean condition=row >= col;
        if(condition)
        System.out.print("0");  
        else 
            System.out.print(" ");  
    }  
        
      System.out.println();
      
      
      
      }
    }
        
   
        
    }
    
    

