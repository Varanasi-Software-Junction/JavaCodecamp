package shivank;
import java.util.*;

public class aug3
{
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int p=sc.nextInt();
            int k=sc.nextInt();
            
            int a[][]=new int[n][2];
            

            for(int i=0;i<n;i++)
            {
                a[i][0]=(i%k);
                a[i][1]=i;
                
            }
            
            
            
    for(int i=0;i<=a.length-2;i++)
    {
        for(int j=0;j<=a.length-2-i;j++)
        {
            if(a[j][0]>a[j+1][0])
        {
            int m=a[j][0];
            int o=a[j][1];
            a[j][0]=a[j+1][0];
            a[j+1][0]=m;
            a[j][1]=a[j+1][1];
            a[j+1][1]=o;

        }

        }

    }
    
        for(int i=0;i<n;i++)
        {
                if(a[i][1]==p)
                {
                System.out.println(i+1);
                return;
                }
        }

            

            




            
           t--;
        }

    }

}