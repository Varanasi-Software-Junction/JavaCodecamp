package stack;

import java.util.Map;

import java.util.*;
public class mapBasic {
    
    public static void main(String[] args) {
    int a[]={5,8,9,6,3,6,5,4,9,4,-4};
    Map<Integer,Integer> map=new TreeMap<>();
   
    for(int i=0;i<a.length;i++)
    {
    
     map.put(i,a[i] );
     
    }

     System.out.println(map.keySet());
     System.out.println(map.values());
     System.out.println(map);
     // map.put(key, value);



    }

    
}
