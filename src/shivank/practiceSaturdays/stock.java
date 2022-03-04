package shivank.practiceSaturdays;

import java.util.Arrays;

public class stock {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);10,22,5,75,65,80    2,30,15,10,8,25,80
        int a[]={10,22,5,75,65,80};
        int n=a.length;
        int min=Integer.MAX_VALUE;
        int profit=0;
        int pos=0;
        int z=0;
        int b[]=new int[n];
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
                continue;
            }
            if(a[i-1]>a[i])
            a[i-1]=0;
            else
            {
                a[i-1]=a[i]-min;
            }
           
            
            
            
        }
        int sum=0,max=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==0 && max<sum)
            {
                max=sum;
                sum=0;}
            sum+=a[i];

        }
    
        
        a[n-1]=0;
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
    }
    
}
