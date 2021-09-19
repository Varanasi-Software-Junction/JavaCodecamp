package string;

import java.util.*;
public class pythogoreanTriplet {
    public static void main(String args[])
    {
        int  n=100;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                int sum=i*i+j*j;
                int c=(int)Math.sqrt(sum);
                double sqr=Math.sqrt(sum)-c;
                if(sum<=10000 && sqr==0)
                {
                System.out.println(i+" "+j+" "+c);
                count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
