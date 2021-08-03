
package javacodecamp;

public class Scratchsenod {
public static void main(String[] args) {
   int n=7;
     int mid=(n+1)/2;
      for(int row=1;row<=n;row++)
     {
         for(int col=1;col<=n;col++)
         {
         boolean condition= col==mid && row==1 || col==mid && row==n || row==mid && col==1 || row==mid && col==n;   
                
           if(condition)      
         System.out.print("0");
           else
          System.out.print(" ");
            }      
            System.out.println();
     }
    }
    
}

