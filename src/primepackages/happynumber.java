package primepackages;
import java.util.Scanner;
public class happynumber {
public static void main(String[] args) {
 Scanner sc= new Scanner (System.in);
 int n=sc.nextInt();
       int s=0;
       int d=0;     
       while(n>0)
           {
           d=n%10;
           s=s+(d*d);
           n=n/10;
         }
       if(s==1)
       {
        System.out.println("Happy number");
       }
       else
       {
         System.out.println("Not a happy number");
       }
   }

}