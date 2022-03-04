package collectionspackage;

import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        int[] a = {5, 10, 20, 3, 4, 23, 2};
        /*Partition this array such that all elements>=5 go to the right
        and less than 5 to the left.*/
        /*5 will be shifted by the number of positions equal to the number of elements less than 5
        
        
        */
        int pivot=a[0];//Pivot is the element across which partition is to be done
        int fp=0;//fp is final position of pivot
        int t;//temp variable for swapping
        System.out.println("Array before partition: " + Arrays.toString(a));
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]>=pivot)
                continue;//Do nothing when you get a value>=pivot.
            fp++;//if element less than pivot is found increment final position ny 1
            t=a[i];
            a[i]=a[fp];
            a[fp]=t;
            
        }
        a[0]=a[fp];
        a[fp]=pivot;
        System.out.println("Array after partition: " + Arrays.toString(a));
        System.out.println("Partition at : " + fp);
    }
}
