package stack;
import java.util.Stack;

public class stackBasic {
    public static void main(String[] args) {
        String string="mbddbp";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<string.length();i++)
        {
            stack.push(string.charAt(i));
        }
        System.out.println(stack.size());
        String h="";
        int i=0;
        while(!stack.empty())
        {
            char ch=string.charAt(i++);
            char stackchar=stack.pop();
            if(ch!=stackchar)
            {
                System.out.println(string+ " Not Palindrome");
                return;
            }
            
        }
        System.out.println(string+ " Palindrome");


       


    }
    
}
