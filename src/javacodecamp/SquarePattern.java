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
public class SquarePattern {
    public static void main(String[] args) {
        int n=1;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print("0");
            }
            System.out.println();
        }
    }
  
}
