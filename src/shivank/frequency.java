package shivank;
import java.util.Arrays;

public class frequency{// counting sort

    public static void main(String args[])
    {
        int a[]={1,4,6,0,3,2,4,6,1};
        int [] frequencies=new int[10];
        for(int i=0;i<a.length;i++)
        {  
           frequencies[a[i]]++; 
            

        }
        System.out.println(Arrays.toString(frequencies));  
        for(int i=1;i<frequencies.length;i++)
        {  
           frequencies[i]=frequencies[i] + frequencies[i-1];          

        }
        System.out.println(Arrays.toString(frequencies));  
        int b[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            int element = a[i];
            int pos=frequencies[element];
            b[pos-1]=element;
            frequencies[element]--;
        }

        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println(Arrays.toString(b));

                
            
            
        }

        



    }
