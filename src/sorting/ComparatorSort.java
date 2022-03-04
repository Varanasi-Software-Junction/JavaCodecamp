package sorting;
import java.util.Arrays;
import java.util.Comparator;
public class ComparatorSort {
    public static void main(String[] args) {
        String[] strings={"Apple","Bandook","Cat"};
        Arrays.sort(strings,new UltaComparator());
        System.out.println(Arrays.toString(strings));
         Arrays.sort(strings,new SeedhaComparator());
        System.out.println(Arrays.toString(strings));
    }

   
}
class SeedhaComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
    
}
class UltaComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
    
}
