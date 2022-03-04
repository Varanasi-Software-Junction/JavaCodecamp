package stackpackage;
import java.util.Stack;
//{}, [], ()
public class eqution {
    public static void main(String[] args) {
   Stack<Integer> stack =new  Stack<Integer>();
   String string="a*(b+c*(d+v))";
   string ="(" + string + ")";
   char[] chars=string.toCharArray();
   int n=chars.length;
   for(int i=0;i<=n-1;i++)
   {
       char ch=chars[i];
       if(ch=='(')
          stack.push(i);
       if(ch==')')
       {
           int start=stack.pop();
           System.out.printf("%s to %s\n",start,i);
           String bracketedstring=string.substring(start, i+1);
           System.out.println(bracketedstring);
       }
   }
        System.out.println(stack);
    }
}
