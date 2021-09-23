package sorting;
import java.util.Arrays;
import java.util.Comparator;
public class ComparatornumberSort {
    public static void main(String[] args) {
    String[] strings={"one","two","three","four"};
     Arrays.sort(strings,new nextComparator());
    System.out.println(Arrays.toString(strings));
         Arrays.sort(strings,new perviousComparator());
        System.out.println(Arrays.toString(strings));
    }
    
}
class nextComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
    
}
class perviousComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
    
}

