
package patterns;

/**
 *
 * 
 * input 3
 * 1
 * 2 1
 * 1 2 3
 * 2 1
 * 1
 * 
 * input = 4
 * 1
 * 2 1
 * 1 2 3
 * 4 3 2 1
 * 1 2 3
 * 2 1
 * 1
 */
public class PatternTwo {
    public static void main(String[] args) {
        int n=5;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(i % 2==0)
                System.out.print(j);
                else
                    System.out.print(i+1-j);
            }
            System.out.println();
        }
        
        
        
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                  if(i % 2==0)
                System.out.print(j);
                else
                    System.out.print(i+1-j);
            }
            System.out.println();
        }
    }
}
