package trees;
import java.util.*;
import java.util.HashSet;
import java.util.Map;
public class Countwords {
    public static void main(String[] args) {
        Set<String> s1=new HashSet<>();
        
        Map<String,Integer> m1=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        Set<String> s2= new HashSet<>();
        s2.add("is");
        s2.add("a");
        s2.add("an");
        s2.add("the");
        s2.add("This");
        s2.add("that");
        s2.add("Hi");
         
        while(true)
        {
            //System.out.println("abcd");
            String str=sc.next();
            
            int value=m1.getOrDefault(str, 0);
            m1.put(str,value+1);
            s1.add(str);
            System.out.println(m1);
            //System.out.println(s1);
        Object[] a=    s1.toArray();
            System.out.println(Arrays.toString(a));
            s1.removeAll(s2);
            System.out.println(s1);
            
            
    
        }
    }
    
}
