/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahul;
//+, -, *, /, %
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();;
        int sum = a+b;
        System.out.println(sum);
        int minus=a-b;
        System.out.println(minus);
        int mul=a*b;
        System.out.println(mul);
        int div=a/b;
        System.out.println(div);
        System.out.println(1/2);
        System.out.println(1/2.0);
        System.out.println(1.0/2);
        System.out.println(1.0/2.0);
    }
}
