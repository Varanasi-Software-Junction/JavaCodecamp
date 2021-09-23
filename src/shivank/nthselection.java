package shivank;

import java.util.Arrays;

public class nthselection{
    public static void main(String args[])
    {
        
        int a[]={2,0,6,8,4,-1,5};
        int n=1;

        
        if(n>a.length || n<0)
        return;
        int p=n;
        // n=-9, n=99
        //6 
        if(n>a.length/2)
        n=a.length-n;
        for(int i=0;i<=n;i++)
        {
            int min=a[i],pos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(p<=a.length/2)
                {
                if(a[j]<min)
                {
                    min=a[j];
                    pos=j;
                    //System.out.println(min);
                }}
                if(p>a.length/2)
                {if(a[j]>min)
                    {
                        min=a[j];
                        pos=j;
                        //System.out.println(min);
                    }}

                
            }
            //System.out.println(a[pos]);
            
            a[pos]=a[i];
            a[i]=min;
            
            
               
        }

            if(p<=a.length/2)
            System.out.println(a[n-1]);
            else
            System.out.println(a[n]);

            System.out.println(Arrays.toString(a));
        

    }

}