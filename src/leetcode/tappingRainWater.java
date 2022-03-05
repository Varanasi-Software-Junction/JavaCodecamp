package leetcode;

import java.util.Arrays;

public class tappingRainWater {
    public static void main(String[] args) {
        int a[]={4,0,0,0,0,0,3};
        int n=a.length;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        //a[0]=9;
        int sum=0,sum1=0;
        int max=0;
        int big=-1;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                
            sum+=a[i]-a[i+1];
            a[i+1]=a[i];
            }
            if(a[i]<a[i+1])
            {
                
                System.out.println(sum+" "+big+" "+count);
            }

        }
        
        for(int i=0;i<n;i++)
        {
            sum1+=a[i];
        }
        System.out.println(Arrays.toString(a)+" "+Arrays.toString(b)+" "+sum +" "+sum1);
    }
    
}
