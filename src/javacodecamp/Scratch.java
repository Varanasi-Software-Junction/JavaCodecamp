
package javacodecamp;

public class Scratch {
    public static void main(String[] args) {
     int n=7;
     int mid=(n+1)/2;
      for(int row=1;row<=n;row++)
     {
         for(int col=1;col<=n;col++)
         {
         boolean condition= row -col== mid-1 || row + col == mid + n || row + col == mid + 1 || col - row == mid - 1;  
                
           if(condition)      
         System.out.print("0");
           else
          System.out.print(" ");
            }      
            System.out.println();
     }
    }
    
}
