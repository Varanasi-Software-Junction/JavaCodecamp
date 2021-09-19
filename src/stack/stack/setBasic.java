package stack;

import java.util.HashSet;
import java.util.Set;

public class setBasic {
    public static void main(String[] args) {
        Set s1=new HashSet<String>();
        s1.add("Shiv");
        s1.add("Kumar");
        s1.add("Ram");
        s1.add("Shyam");
        s1.add("Shiv");
        System.out.println(s1);
        s1.remove("Ram");
        Set s2=new HashSet<String>();
        s2.add("Shyam");
        s2.add("Kumar");
        s2.add("Gulabo");
        //System.out.println(s1.retainAll(s2));
        System.out.println(s1.addAll(s2));


        
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
