
package sorting;

import java.util.Arrays;

public class twonumberarray {
    public static void main(String[] args) {
     int a[] =  {1,2,3,4, };         
      int b[]= {2,4,5,9} ;
      int c[]= new int[a.length+b.length];
    
    int k=0,i=0,j=0;
    while(i<=a.length-1 && j<=b.length-1)
    {
        if(a[i]<b[j])
        {
            c[k]=a[i];
            k++;
            i++;
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
        {
            c[k]=a[i];
        }
    }
    else
    {
         for(;j<=b.length-1;j++,k++)
        {
            c[k]=b[j];
        }
    }
    
    
    
        System.out.println(Arrays.toString(c));
   }
}


    
    

