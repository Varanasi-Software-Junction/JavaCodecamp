package shivank;
import java.util.Arrays;
import java.util.Scanner;
public class scratch {
    public static void main(String args[]) {
        int[] a={1,2,3,4,5};
     int [] b=Arrays.copyOfRange(a, 0,0);
     System.out.println(Arrays.binarySearch(b,0));
     System.out.println(b.length);
     System.out.println(Arrays.toString(b));
    }
}