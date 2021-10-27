
package sorting;

import java.util.Arrays;
import java.util.Comparator;


public class ArraysSort {
    public static void main(String[] args) {
        Integer[] a={10,2,33,2,1};
        //Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new  IntCompare());
        System.out.println(Arrays.toString(a));
        String[] strings={"apple","ball","cat"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, new  StringCompare());
        System.out.println(Arrays.toString(strings));
    }
    
 
}

class StringCompare implements Comparator<String>
{  

    @Override
    public int compare(String a, String b) {
       return a.length()-b.length();
    }
    
}




class IntCompare implements Comparator<Integer>
{  

    @Override
    public int compare(Integer a, Integer b) {
       return b-a;
    }
    
}
