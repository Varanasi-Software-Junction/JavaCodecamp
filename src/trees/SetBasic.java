package trees;
import java.util.*;
public class SetBasic {
    public static void main(String[] args) {
        Set s1=new HashSet<String>();
        s1.add("shiva");
        s1.add("Kumar");
        s1.add("rahul");
        s1.add("shivaji");
        s1.add("sachin");
        System.out.println(s1);
        s1.remove("sachin");
        System.out.println(s1);
        s1.add("ram");
        System.out.println(s1);
        Set s2=new HashSet<String>();
        s2.add("roshan");
        s2.add("mohan");
        s2.add("ravan");
        System.out.println(s1.addAll(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}
