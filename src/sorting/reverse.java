package sorting;
import java.util.Arrays;
public class reverse {
     static void reverse(int array[])
    {
        //0 to n-2,  n-1 to 1
        int n = array.length;
    for (int i=(n-1);i>0;i--)
    { 
      for (int j=(n-1);j>0;j--) 
      {
        if (array[j] > array[j - 1]) {
          int temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
        }
        }
    }
    }
    public static void main(String args[]){
        int a[] = {1,4,8,9,6,7,3,5,0,2};
        reverse(a);
  System.out.println("reverse");
    System.out.println(Arrays.toString(a));

        }
}
        


