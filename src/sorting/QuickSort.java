package sorting;
import java.util.Arrays;
public class QuickSort {
    public static void qSort(int[] a,int left,int right)
    {
        if(left>=right)
            return;
        int pivot=a[left];
        int fp=left,t;
        for(int i=left + 1;i<=right;i++)
        {
            if(a[i]>=pivot)
                continue;
            fp++;
            t=a[i];
            a[i]=a[fp];
            a[fp]=t;
        }
        //System.out.println(Arrays.toString(a));
        t=a[fp];
        a[fp]=a[left];
        a[left]=t;
        qSort(a, left, fp-1);
        qSort(a,  fp+1,right);
    }
    public static void main(String[] args) {
        int[] a={-300,2,4,55,-67,7};
        System.out.println(Arrays.toString(a));
        qSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    
}
