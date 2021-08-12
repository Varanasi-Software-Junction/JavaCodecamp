
package primepackages;
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         int num =254;// sc.nextInt();
         int base=8;
        System.out.println("Enter The Decimal Number : ");
         System.out.println(6 + 8*7 + 8*8*3);
      
        String binary = "";   
        int rem = 0;                 
        while (num > 0)
        {
            rem = num % base;
             if(rem<=9)
            binary =  rem + binary;
             else
             {
                 rem=rem-10;
                 char ch=(char)('A' + rem);
                 binary=ch + binary;
             }
             
            num = num/base;
        }
         
        System.out.println("Binary " + " is "+binary);
    }
}
   
        
    
