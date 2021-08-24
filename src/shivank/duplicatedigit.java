package shivank;

import java.util.Arrays;

public class duplicatedigit {
    public static void main(String args[])
    {
        int a[]={1,5,7,3,4,9,5,0,6};
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==a[i+1])
            {System.out.println(a[i]);
            break;}
        }

    }
    
}
