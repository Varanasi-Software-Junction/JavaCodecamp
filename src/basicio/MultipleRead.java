/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicio;

import java.util.Scanner;

/**
 *
 * @author rakesh
 */
public class MultipleRead {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int sum=0;
        while (sc.hasNextInt()) {
            sum = sum + sc.nextInt();
            System.out.println(sum);
            
        }
        System.out.println("Total = " + sum);
    }
  
}
