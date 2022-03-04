package stackpackage;
import java.util.Deque;
import java.util.Stack;
public class eqution2 {
    public static void main(String[] args) {
       
        Stack<Integer> stack =new Stack<Integer>();
        String string="5a*{(7b+8c*)[7d+3v]}";
        string ="(" + string + ")";
        char[] chars=string.toCharArray();
        int n=chars.length;
        int a=0;
        for(int i=0;i<=n-1;i++)
        {
        if(chars[i]=='(')
            a+=1;
        if(chars[i]=='{')
            a+=2;
        if(chars[i]=='[')
            a+=3;
         if(chars[i]==')')
             a-=1;
        if(chars[i]=='}')
            a-=2;
        if(chars[i]==']')
            a-=3;
        
        }
   
   if (a!=0)
   {
       System.out.println("Invalid Expression");
       return;
   }
   for(int i=0;i<=n-1;i++)
   {
       char ch=chars[i];
       if(ch=='(' || ch=='{' || ch=='[')
           stack.push(i);
        if(ch==')')
       {
           int start=stack.pop();
           System.out.printf("%s to %s\n",start,i);
           String bracketedstring=string.substring(start, i+1);
           System.out.println(bracketedstring);
       }
        if(ch=='}')
       {
           int start=stack.pop();
           System.out.printf("%s to %s\n",start,i);
           String bracketedstring=string.substring(start, i+1);
           System.out.println(bracketedstring);
       }
        if(ch==']')
        {
           int start=stack.pop();
           System.out.printf("%s to %s\n",start,i);
           String bracketedstring=string.substring(start, i+1);
           System.out.println(bracketedstring);
       }
   }
    }
    }
    

