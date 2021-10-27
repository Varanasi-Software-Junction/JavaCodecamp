package stack;

import java.util.Stack;

class parenthesis
{
    public static void main(String[] args) {
        String s="(A*(b+c)+(h/k)-k)+j";
        int c=0,max=-1;
        Stack<Integer> q=new Stack<>();
       
        
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            q.push(i);
            if(s.charAt(i)==')')
               {   
                   int st=q.pop();
                   System.out.println(s.substring(st, i+1));
                }

            
        }}}
