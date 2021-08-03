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
public class Add {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner s=new Scanner(System.in);
        int a =s.nextInt();
        int b=s.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}
