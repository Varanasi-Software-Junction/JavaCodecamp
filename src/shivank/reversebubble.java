package shivank;

import java.util.Arrays;

public class reversebubble
{
    public static void main(String args[])
    {
        int a[]={2,0,1,5,3,9,6};
        int y=0;
        for(int i=a.length-1;i>0;i--)
        {
            
            for(int j=a.length-1;j>0+y;j--)
            {
                if(a[j]<a[j-1])
                {
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
                System.out.println(Arrays.toString(a));

            }
            y++;
        }
        System.out.println(Arrays.toString(a));

    }
}