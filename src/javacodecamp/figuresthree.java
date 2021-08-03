/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodecamp;

/**
 *
 * @author rakesh
 */
public class figuresthree {
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
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
                System.out.print("*");
            
            System.out.println();
        }
    }
    }
 

 



    


    

