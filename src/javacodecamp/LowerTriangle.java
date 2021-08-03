/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodecamp;

/*
___*
__***
_*****
*******
   *
  ***
 *****
n=3
space   star
3       1
1       3
0       5
2X1-1-1
2X2-1 =3
2X3-1=5
 */
public class LowerTriangle {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
                System.out.print("*");
            System.out.println();
        }
    }
 
}
