package collectionspackage;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //Stack<String> stack=new  Stack<String>();
        Stack<String> stack=new  Stack<>();
        stack.push("Apple");
        stack.push("Ball");
        stack.push("Cat");
        System.out.println(stack);
        System.out.println( stack.peek());
        System.out.println(stack);
        System.out.println( stack.pop());
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        //stack.pop();//Throws Exception if stack is empty
    }
  
}
