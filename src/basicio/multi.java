

package basicio;

import java.util.Scanner;

/**
 *
 * @author rakesh
 */
public class multi {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner s=new Scanner(System.in);
        int a =s.nextInt();
        int b=s.nextInt();
        s.close();
        int multi=a*b;
        System.out.println(multi);
    }
}


      

   

