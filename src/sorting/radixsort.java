package sorting;
import java.util.Arrays;
public class radixsort {
    public static void main(String[] args) {
        //System.out.println(findPlace(123,3));
        int a[]={123,321,98,345,341};
        System.out.println(Arrays.toString(a));
       int digit=getMaxSize(a);
       for(int i=1;i<=digit;i++)
       {
          
        a=countingSort(a, i);
       //System.out.println(Arrays.toString(a));
       }
       System.out.println(Arrays.toString(a));
    }
    
    static int[] countingSort(int [] a)
    {
       int b[]=new int[a.length];
       int frequencies[]=new int[10];
       for(int i=0;i<a.length;i++)
       {
          frequencies[a[i]]++;
          }
       for(int i=1;i<a.length;i++)
       {
        
        frequencies[i]=frequencies[i]+frequencies[i-1];
       }
        
        for(int i=a.length-1;i>=0;i--)
        {
         int element=a[i];
         int epos=frequencies[element];
         b[epos-1]=element;
         frequencies[element]--;
        }
        
        
        
        return b;
        
       }
    
    static int getMaxSize(int[] a)
    {
        int max=-1;
        for(int n : a)
        {
            if(("" + n).length()>max)
                max=("" + n).length();
            
        }
        return max;
    }
   static int getDigitAtPosition(int n,int pos)
   {
       
       for(int i=1;i<=pos-1;i++)
       {
           n=n/10;
                   }
       return n % 10;
   }
    
    static int[] countingSort(int [] a,int pos)
    {
       int b[]=new int[a.length];
       int frequencies[]=new int[10];
       
       for(int i=0;i<a.length;i++)
       {
           int key=getDigitAtPosition(a[i], pos);
          frequencies[key]++;
          }
        //System.out.println(Arrays.toString(frequencies));
       for(int i=1;i<frequencies.length;i++)
       {
        
        frequencies[i]=frequencies[i]+frequencies[i-1];
       }
        //System.out.println(Arrays.toString(cf));
        for(int i=a.length-1;i>=0;i--)
        {
         int element= a[i];
         int key=getDigitAtPosition(element, pos);
         int epos=frequencies[key];
         b[epos-1]=element;
         frequencies[key]--;
        }
        
        
        
        return b;
        
       }
       }

