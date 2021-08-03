
package javacodecamp;

public class nonleadingdiagoonal {
public static void main(String[] args) {
        int n=7;
        for(int row=1;row<=n;row++)
        {
        for(int col=1;col<=n;col++)
        {
        boolean condition=col + row==n+1;

        if(condition)
         System.out.print("o");
             
        else
        System.out.print(" ");
        }   
         System.out.println();
    }

    
    
}
}
