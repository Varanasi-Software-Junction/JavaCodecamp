package sorting;
import java.util.Arrays;

public class HeapSort {
    static int[] makeHeap(int[] a)
    {
        int[] heap=new int[a.length + 1];
        for(int i=0;i<=a.length-1;i++)
        {
            int value=a[i];
            int pos=i + 1;
            heap[pos]=value;
            while(true)
            {
                int parentpos=pos/2;
                if(parentpos<=0)
                    break;
                if(heap[parentpos]>=value)
                    break;
                int t=heap[pos];
                heap[pos]=heap[parentpos];
                 heap[parentpos]=t;
                pos=parentpos;
            }
        }
        return heap;
    }
    public static void main(String[] args) {
        int[] a={5,3,8,1,80,9};
       int [] heap=makeHeap(a);
       // System.out.println(Arrays.toString(heap));
        for(int i=1;i<=heap.length-1;i++)
        {
            //System.out.println(Arrays.toString(heap));
            int value=heap[1];
            //System.out.println(value);
            a[a.length-i] =value;
            int pos=1;
            heap[1]=heap[heap.length-i];
            value=heap[1];
            System.out.println(Arrays.toString(heap));
            int heapsize=heap.length-i-1;
            while(true)
            {
                int left=2*pos;
                int right=left + 1;
                if(left>heapsize)
                    break;
                //System.out.println(left);
                int max=heap[left];
                int maxpos=left;
                if(right<=heapsize)
                {
                    if(heap[right]>max)
                    {
                        max=heap[right];
                        maxpos=right;
                    }
                }
                
                if(value>=max)
                    break;
             
                int t=heap[pos];
               heap[pos]= heap[maxpos];
               heap[maxpos]=t;
               
               pos=maxpos;
               
               value=max;
            //    System.out.println(value);
                
            }
            
            }
          
        System.out.println(Arrays.toString(a));
    }   
            
        }
        
     
    

