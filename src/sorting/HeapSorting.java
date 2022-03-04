package sorting;

import java.util.Arrays;

public class HeapSorting {

    public static void main(String[] args) {
        int[] a = {7, 8, 10, 5, 4, 9, 11};
        int n = a.length;
        int heap[] = new int[n + 1];
        System.out.println("Input Array " + Arrays.toString(a));
        //*********************Make the Heap*************
        for (int i = 0; i <= n - 1; i++) {
            heap[i + 1] = a[i];

            int pos = i + 1;
            //*********************Adjust the Heap*************
            while (true) {
                int parent = pos / 2;
                if (parent < 1) {
                    break;
                }
                if (heap[parent] >= heap[pos]) {
                    break;
                }
                int t = heap[pos];
                heap[pos] = heap[parent];
                heap[parent] = t;
                pos = parent;

            }
        }

        System.out.println("Heap " + Arrays.toString(heap));
        //********************Heap Sort*************
        for(int i=1;i<=n;i++)
        {
            a[n-i]=heap[1];
            int length=n-i + 1;
            heap[1]=heap[length];
            length--;
            int pos=1;
            while (true) {                
                int left=2*pos;
                if(left>length)
                    break;
                int right =left + 1;
                int maxchildpos=left;
                if(right<=length)
                {
                    if(heap[right]>heap[maxchildpos])
                        maxchildpos=right;
                }
                if(heap[pos]>=heap[maxchildpos])
                    break;
                int t=heap[pos];
                heap[pos]=heap[maxchildpos];
                heap[maxchildpos]=t;
                pos=maxchildpos;
            }
            
            
        }
        //******88888Heap Sorting ends****************88
        System.out.println("Sorted " + Arrays.toString(a));
    }

}
