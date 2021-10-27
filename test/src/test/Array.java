package test;
import java.util.Arrays;
public class Array {
    public static int findfMin(int[] a,int limit)
    {
        int min=a[0];
        for(int i=1;i<=limit-1;i++)
            if(a[i]<min)
                min=a[i];
        return min;
    }
    public static int findfMax(int[] a,int limit)
    {
        int n=a.length;
        int max=a[n-1];
        for(int i=limit;i<=n-1;i++)
            if(a[i]>max)
                max=a[i];
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,30,15,10,8,25,80};
        //int a[]={0,28,13,8,78,23,78};
        int n=arr.length;
        int[] forward=new int[n];
        //int b[]={78,50,65,70,72,55,0};
        int n1=arr.length;
        int[] backward=new int[n1];
       // System.out.println(findfMin(arr, 3));
   for(int i=n-1;i>=1;i--)
           forward[i]=arr[i]-findfMin(arr, i);
       // System.out.println(findfMax(arr, 3));
    {
    for(int j=0;j<=n-1;j++)
    backward[j]=findfMax(arr,j)-arr[j];
      System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(forward));
    System.out.println(Arrays.toString(backward));
    }
    }
}

