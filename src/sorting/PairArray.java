package sorting;
import java.util.*;
import java.util.Arrays;
public class PairArray {
    public static void main(String[] args) 
    {
        int[] A = { 9, 7, 1, 3, 5, 4 };
        int B = 18;
        
        for (int i = 0; i< A.length - 1; i++)
        {
            for (int j = i+1; j< A.length; j++)
      
                if (A[i] + A[j] == B)
                {
      System.out.println("Pair found (" + A[i] + ", " + A[j] + ")");
                    return;
                }
            }
        System.out.println("Pair not found");
        }
}
        
    
        
    
    
    
    
    
    
