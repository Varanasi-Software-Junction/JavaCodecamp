package string;
import java.util.*;


public class primefactors2 {
    public static void main(String args[])
    {
        int num=24;
        int i=2;
        int c=0;
        while(num!=1)
        {
            
            if(num%i==0)
            {//System.out.println(i);
               c=1;
                num/=i;
                
                
            }
            else{
                 if(c==1)
                 System.out.println(i);
                 c=0;   
                i++;
            }
            
            

        }
        System.out.println(i);
    
}
}
