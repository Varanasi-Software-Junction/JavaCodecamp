/*
*****
** **
*   *
n=3
h=2*n-1 = 5
i   left*    midspace    right*
                1
                3
                5



*/
package javacodecamp;

/**
 *
 * @author rakesh
 */
public class Darwaza {
    public static void main(String[] args) {
        int n=10;
        int h=2*n-1;
        for(int i=1;i<=h;i++)
            System.out.print("*");
        System.out.println();
        for(int i=1;i<=n-1;i++)
        {
            int noofspaces=2*i-1;
            int noofstars=(h -noofspaces)/2;
            for(int left=1;left<=noofstars ;left++)
                System.out.print("*");
            for (int space=1;space<=noofspaces;space++)
                System.out.print(" ");
            for(int left=1;left<=noofstars ;left++)
                System.out.print("*");
            System.out.println();
        }
    }
}
