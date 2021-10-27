package stack;

import java.util.*;

public class SeptLong1 {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int a[]=new int[5];
            for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
            int f=(a[0]+a[1]<=a[3] && a[2]<=a[4])?1:(a[0]+a[2]<=a[3] && a[1]<=a[4])?1:(a[2]+a[1]<=a[3] && a[0]<=a[4])?1:0;
            if(f==1)
            System.out.println("YES");
            else 
            System.out.println("NO");
            t--;
        }
    }
    
}
