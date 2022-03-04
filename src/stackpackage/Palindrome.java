
package stackpackage;

import java.util.Stack;


public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stack =new  Stack<Character>();
        String string= "madam";
        String exp="a*(b+c*(d+v))";
        char[] cs=string.toCharArray();
        for(char ch : cs)
        {
            stack.push(ch);
        }
        System.out.println(stack);
        for(char ch : cs)
        {
            char stackchar=stack.pop();
            if(ch!=stackchar)
            {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
        
        
        
    }
 
}
