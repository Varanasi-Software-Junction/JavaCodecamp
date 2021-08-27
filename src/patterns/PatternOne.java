
package patterns;

/**
 *
 * input 2
 * 1
 * 2 1
 * 1
 * input 3
 * 1
 * 2 1
 * 3 2 1
 * 2 1
 * 1
 */
public class PatternOne {
    public static void main(String[] args) {
        int n=3;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        
        
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
