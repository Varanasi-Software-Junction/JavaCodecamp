
package collectionspackage;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetUse {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        Set<String> set=new  TreeSet<>();
        Scanner scanner=new Scanner(System.in);
        while (true) {            
            String  string=scanner.next();
            set.add(string);
            
            int value=map.getOrDefault(string, 0);
            map.put(string, value+1);
            System.out.println(set);
            System.out.println(map);
        }
        
        
        
    }
}

