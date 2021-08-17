
package primepackages;
import java.util.Scanner;
public class PowerNumber {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the  number ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int product=1;
      for (int i=1; i<=b; i++){
          product*=a;
      }
      System.out.println(product);
   }
}
    
    

