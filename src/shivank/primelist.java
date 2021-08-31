package shivank;

import java.util.*;
public class primelist{
    public static void main(String args[])
    {
        int n=6;
        int sc=n;
        int a[]=new int[n];
        a[0]=2;
        a[1]=3;
        int pri=1;
        int c=1;
        for(int i=5;i<=15;i+=2)
          {  for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {pri=0;
                
                }

            }
            
        
        if(pri==0)
                {
                    a[++c]=i;
                sc--;
             if(sc==0)
             break;
                }
        for(int q=0;q<=a.length-1;q++)
        {
            System.out.println(a[q]);
        }
    }

}
}