
package loops;

import java.util.Arrays;


public class CountingSort {
    public static void main(String[] args) {
      int[] a={1,2,2,2,3,4,5,5,5,1,2};
      int [] frequencies=new int[10];
      for(int n : a)
      {
          frequencies[n]++;
      }
        System.out.println(Arrays.toString(frequencies));
        for(int i=1;i<=frequencies.length-1;i++)
        {
            frequencies[i]=frequencies[i] + frequencies[i-1];
        }
        System.out.println(Arrays.toString(frequencies));
        int[] b=new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            int element=a[i];
            int pos=frequencies[element];
            b[pos-1]=element;
            frequencies[element]--;
            
        }
        System.out.println(Arrays.toString(b));
    }
 
}
