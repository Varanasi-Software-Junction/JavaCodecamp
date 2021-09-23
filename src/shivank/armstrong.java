package shivank;
import java.util.Scanner;
public class armstrong
{
    
        
    
    
    public static void main(String []args)
    {
      for(int a=0;a<=50000;a++)
        {
            int num=a,sum=0;
            while(num>0)
            {
                int rem=num%10;
                sum+=rem*rem*rem;
                num/=10;
    
            }
            if(a==sum)
            {System.out.println(a+",");}       
        }  
        
        }
        

    }

