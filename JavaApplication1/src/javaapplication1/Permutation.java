
package javaapplication1;

import java.util.Arrays;

public class Permutation {
    public static void permute(int[] a,int pos,int n)
    {
        if(pos>n)
            return;
        
        for(int i=a[pos-1];i<=9;i++)
        {
        
        a[pos-1]=i;
        if(pos==n)
        System.out.println(Arrays.toString(a));
        else
        permute(a, pos+1, n);
        }
    }
    public static void main(String[] args) {
        int n=3;
        int[] a =new int[n];
        permute(a, 1, n);
    }
}
