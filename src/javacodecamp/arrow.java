
package javacodecamp;
public class arrow {
    public static void main(String[] args) {
        int n=7;
        int mid=(n+1)/2;
        {
         for(int row=1;row<=n;row++)
         {
             for(int col=1;col<=n;col++)
                 {
         boolean condition= row== mid || col-row== mid-1 || row+col== n+mid;
           if(condition)       
         System.out.print("0");
           else
          System.out.print(" ");
            }      
            System.out.println();
         }   
        
        }
    }
}
