package shivank;

import java.util.Arrays;

public class permutenum
{
    static boolean find(int[] a,int pos,int value)
    {
        for (int i =0;i<=pos-1;i++)
        {
            if(value==a[i])
            return true;
        }
        return false;
    }
    static void permute(int index,int maxindex,int[] a)
    {

        for(int i=0;i<=maxindex;i++)
        {
           
            
            if(find(a, index, i))
            continue;
            a[index]=i;
if(index==maxindex)
{                                                                                                
System.out.println(Arrays.toString(  a));// + "," + Arrays.toString(  b) + "," + pos + "," + i);
}
else
permute(index+1, maxindex, a);
        }
}
    
    
    public static void main(String args[])
    {
        int n=3;
        int[] a =new int[n+1];
 permute(0,n,a);       

        
         


    }
    



    
}