package rahul;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] a={1,3,5,6};
        int[] b={0,2,3,7};
        int[] c=new int[a.length + b.length];
        int i=0,j=0,k=0;
        while(i<=a.length-1 && j<=b.length-1)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i<=a.length-1)
        {
            for(;i<=a.length-1;i++,k++)
                c[k]=a[i];
        }
        else
        {
           for(;j<=b.length-1;j++,k++)
                c[k]=b[j]; 
        }
        System.out.println(Arrays.toString(c));
        
    }
}
