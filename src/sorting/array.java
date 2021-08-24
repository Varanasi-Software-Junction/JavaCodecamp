package sorting;
import java.util.Arrays;
public class array{
 static void arrays(int array[]) {
    int n = array.length;
    for (int i = 0; i < (n-1); i++) { 
      for (int j = 0; j < (n-i-1); j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    }
    public static void main(String args[]) {
      
    int[] data = {5,33,7,2,6,9,8};
   BubbleSorttwo .bubbleSort(data);
  System.out.println("Sorted Array in   Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
   



  


