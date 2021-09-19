package stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        Stack<Character> sta=new Stack<>();
        String s="((A+B)*C)";
        s="("+s+")";
        for(int i=s.length()-1;i>=0;i--)
        stack.push(s.charAt(i));
        System.out.println(stack);
        String s1="";
        int first='A';
        int second='a';
        while(!stack.empty())
        {
            char ch=stack.pop();
            if(ch=='(')
            sta.push(ch);
            if(((int)ch>=first && (int)ch<=first+25) || ((int)ch>=second && (int)ch<=second+25) )
            s1+=ch;
            if(ch==')')
            {
                while(sta.peek()!='(')
                s1+=sta.pop();
                
                
                sta.pop();
                //System.out.println(sta);
            }
            if(ch=='^')
            {
                while(sta.peek()=='^')
                s1+=sta.pop();
                sta.push(ch);
            }
            if(ch=='/' || ch=='*')
            {
                while(sta.peek()=='^' || sta.peek()=='*' ||sta.peek()=='/')
                s1+=sta.pop();
                sta.push(ch);
            }
            if(ch=='-' || ch=='+')
            {
                //System.out.println(sta);
                while(sta.peek()=='^' || sta.peek()=='*' ||sta.peek()=='/' || sta.peek()=='+' || sta.peek()=='-')
                s1+=sta.pop();
                sta.push(ch);
            }


            

        }
       // System.out.println(sta);
        System.out.println(s1);

    }
    
}
