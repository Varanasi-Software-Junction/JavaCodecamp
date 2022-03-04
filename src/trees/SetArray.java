package trees;
import java.util.*;
public class SetArray {
public static void main(String args[])    
    {    
        Integer[] A = {1, 5,3, 6,4};  
        Integer[] B = {3, 9, 8,7,10};  
        Set<Integer> set1 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(A));    
        Set<Integer> set2 = new HashSet<Integer>();    
        set2.addAll(Arrays.asList(B));    
      
        Set<Integer> union_data = new HashSet<Integer>(set1);    
        union_data.addAll(set2);    
        System.out.print("Union of set 1 and set 2");    
        System.out.println(union_data);   
        
        Set<Integer> intersection_data = new HashSet<Integer>(set1);
        intersection_data.addAll(set2);
        System.out.println("intersection of set 1 and set 2");
        System.out.println(intersection_data);
}
}

