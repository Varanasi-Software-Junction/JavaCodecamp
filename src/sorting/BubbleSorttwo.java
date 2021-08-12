package sorting;
import java.util.Arrays;
public class BubbleSorttwo {
    static void bubbleSort(int array[]) {
    int n = array.length;
    for (int i = 0; i < (n-1); i++) { // access  array element
    
      for (int j = 0; j < (n-i-1); j++) {//compare array elements
        if (array[j] > array[j + 1]) {//> to < to sort in descending order
          int temp = array[j];//swapping
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    }
    public static void main(String args[]) {
      
    int[] data = {5,3,7,2};
   BubbleSorttwo .bubbleSort(data);
  System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
   

