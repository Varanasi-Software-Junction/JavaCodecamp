/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

public class TernaryUse {

    public static void main(String[] args) {
        int a = 31, b = 4, c = 7;
        /*    int max;
    if(a>=b)
        max=a;
    else 
        max=b;
         */
        int max = (a >= b) ? a : b;
        System.out.println(max);

        max = (a >= b && a >= c) ? a : (b >= c) ? b : c;
        System.out.println(max);

        max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(max);
        max = (a < b || a < c) ? (b > c) ? b : c : a;
        System.out.println(max);

    }
}
