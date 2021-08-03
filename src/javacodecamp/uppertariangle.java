
package javacodecamp;

public class uppertariangle {
 public static void main(String[] args) {
  int n=7;
  int mid=(n + 1)/2;
  for(int row=1;row<=n;row++)
    {
    for (int col=1;col<=n;col++)
    {
  boolean condition=col +row >=mid + 1 && row + col <=mid +n  && row-col<=mid-1 && col-row <=mid-1 && row>=mid;
 
        if(condition)
        System.out.print("0");  
        else 
            System.out.print(" ");  
    }  
        
      System.out.println();
      
      
      
      }
        
    }
    
    
}
