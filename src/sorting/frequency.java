package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
    int a[]={6,5,4,3,2,1,0};
    int[] frequencies=new int[10];
    System.out.println(Arrays.toString(a));
    for(int i=0;i<=a.length-1;i++)//Get Frequencies
    {
             frequencies[a[i]]++;       

    }   
    
        System.out.println(Arrays.toString(frequencies));
    
        for(int i=1;i<=frequencies.length-1;i++)//Get Cumulative Frequencies
        {
            frequencies[i] = frequencies[i] + frequencies[i-1];
        }
        System.out.println(Arrays.toString(frequencies));
        int[] b=new int[a.length];
        for(int i=a.length-1;i>=0;i--)//Sorted Array
        {
            int element=a[i];
            int pos=frequencies[element];
            b[pos-1]=element;
            frequencies[element]--;
        }
        System.out.println(Arrays.toString(b));
    }
    
    
    
}
    
   