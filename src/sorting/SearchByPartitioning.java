package sorting;

public class SearchByPartitioning {
    public static void main(String[] args) {
        int[] a={1,4,3,-6,5,-7};
        int n=3;
        n--;
        int left=0,right=a.length-1;
        while(true)
        {
            int t=a[left];
            a[left]=a[n];
            a[n]=t;
            int fp=left;
            int pivot=a[left];
            for(int i=left + 1; i<=right;i++)
            {
                if(a[i]>=pivot)
                    continue;
                fp++;
                t=a[fp];
                a[fp]=a[i];
                a[i]=t;
                
            }
            
        }
    
    }
}
