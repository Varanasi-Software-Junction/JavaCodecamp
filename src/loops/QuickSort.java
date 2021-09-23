
package loops;

public class QuickSort {
    public static void main(String[] args) {
        int a[]={5,1,3,2,4,6,7,8,9};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
        
        if(a[0]>a[i])
        {
            b[i]=a[i+1];
        }
        System.out.println(b[i]);
        
        }
    }
}
