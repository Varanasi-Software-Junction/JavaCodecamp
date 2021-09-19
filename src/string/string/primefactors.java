package string;
import java.util.*;
public class primefactors {
    public static int checkprime(int s)
    {
        if(s==2 || s==3)
        return s;
        
        for(int i=2;i<=Math.sqrt(s);i++)
        {
            if(s%i==0)
            return 0;
            
        }
        return s;

        }
    
    
    public static void main(String args[])
    {
        int num=72;
        int factors[]=new int[(int)Math.sqrt(num)];
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(num);i++)
        {
            if(num%i==0)
            {   factors[c++]=i;
                
            }
        }
        System.out.println(Arrays.toString(factors));
        for(int i=0;i<factors.length;i++)
        {
            if(factors[i]==0)
            break;
            int s=checkprime(factors[i]);
            if(s!=0)
            System.out.println(s);
        }
    }

    
}
