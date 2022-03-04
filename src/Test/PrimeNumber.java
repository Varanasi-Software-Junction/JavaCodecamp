package Test;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
   Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
	for(int i=2;i<=n-1;i++)
	{
	   if(n%i==0)
	   {
	    System.out.println("Not prime");	
                      return;
	   }
	}
	    System.out.println("prime number ");
    }
}
    


    
    
    

