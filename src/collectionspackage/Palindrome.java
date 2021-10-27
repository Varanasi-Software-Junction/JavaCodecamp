package collectionspackage;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Integer>  stack=new Stack();
        int[] a={1,2,2,1,0};
        for(int i=0;i<=a.length-1;i++)
            stack.push(a[i]);
        System.out.println(stack);
        
         for(int fromarray : a)
         {
             int fromstack=stack.pop();
             if(fromarray!=fromstack)
             {
                 System.out.println("not palindrome");
                 return;
             }
         }
         System.out.println("Palindrome");
    }
}
