package shivank.practiceSaturdays;

import java.util.Arrays;

public class mergingTwoSortedOnes
{
    public static void main(String[] args) {
    int a[]={1,5,8,-2,4};
    int b[]={2,5,7,-1};
    int n=a.length+b.length;
    int len1=a.length;
    int len2=b.length;
    int c[]=new int[n];
    Arrays.sort(a);
    Arrays.sort(b);
    int i=0,j=0,z=0;
    while(i<=len1-1 && j<=len2-1)
    {
        if(a[i]<=b[j])
        {
            c[z++]=a[i++];
            
        }
        if(a[i]>b[j])
        {
            c[z++]=b[j++];
            
        }

    }
    while(i<=len1-1)
    c[z++]=a[i++];
    while(j<=len2-1)
    c[z++]=b[j++];
    System.out.println(Arrays.toString(c));
    System.out.println("HI");

    }
}


