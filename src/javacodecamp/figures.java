
package javacodecamp;
public class figures {

public static void main(String[] args) {
     int n=7;
      int mid=(n+1)/2;
    {
        for(int row=1;row<=n;row++)
        {
        for(int col=1;col<=n;col++)
         {
        
         boolean condition=  col-row== mid-1 || row+col== 1+mid || row-col== mid-1 || col+row== n+mid;
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
    

