package shivank;

import java.util.Arrays;

class removeRepeated {
    public static void main(String[] args) {
        int a[]={1,4,4,5,2,5,5,5,8,4};
        int n=a.length;
        int c[]=new int[n+1];
        for(int i=0;i<n;i++)
        c[i]=a[i];
        c[n]=a[n-1]+1;
        //System.out.print(Arrays.toString(c));
        int b[]=new int[n*2];
        int i=0;
        int z=0;
        int p1=-1,p2=-1;
        while(i<n)
        {
        if(p1==-1)
            p1=i;
        if(c[i]!=c[i+1])
        {
            p2=i+1;
            b[z++]=p1;
            b[z++]=p2;
            p1=-1;
            p2=-1;
        }

        
        
        i++;
        
        
        }
        int m=b.length;
        for(int j=0;j<m-1;j+=2)
        {
            //System.out.println(j);
            if(b[j+1]-b[j]==1)
            System.out.println(c[b[j]]);
        }
           // System.out.print(Arrays.toString(b));
    }
    
}
