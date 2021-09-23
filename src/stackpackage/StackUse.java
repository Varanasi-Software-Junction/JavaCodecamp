
package stackpackage;

import java.util.Stack;

public class StackUse {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.empty())
        System.out.println(stack.pop());
        
    }
}
