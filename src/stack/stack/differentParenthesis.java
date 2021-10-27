package stack;

import java.util.Stack;

public class differentParenthesis {
    public static void main(String[] args) {
        String s="{(a+b)+[(a+n)+b*c]}";
        
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char e=s.charAt(i);
           
            if(e=='(')
            c+=1;
            if(e=='[')
            c+=2;
            if(e=='{')
            c+=3;
            if(e==')')
            c-=1;
            if(e==']')
            c-=2;
            if(e=='}')
            c-=3;



        }
        if(c!=0)
        {System.out.println("Invalid Expression");
            return;}
        Stack<Integer> q=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char e=s.charAt(i);
            if(e=='{' || e=='[' || e=='(')
            q.push(i);
            
            if(e=='}' && s.charAt(q.peek())=='{' )
            {
                //System.out.println(q.peek()+"****");
                System.out.println(s.substring(q.pop(),i+1));
            }
            if(e==']' && s.charAt(q.peek())=='[')
            {
                
                System.out.println(s.substring(q.pop(),i+1));
            }
            if(e==')' && s.charAt(q.peek())=='(')
            {

                System.out.println(s.substring(q.pop(),i+1));
            }

            
        }
    }
    
}
