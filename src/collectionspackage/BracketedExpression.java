package collectionspackage;
import static java.lang.System.out;
import java.util.Stack;

public class BracketedExpression {
    public static void main(String[] args) {
        String exp="a + b * ( d + c * ( d * e + e) +  )";
        exp = "(" + exp + ")";
        Stack<Integer> stack =new Stack<>();
        char[] chars=exp.toCharArray();
        for(int i=0;i<=chars.length-1;i++)
        {
            if(chars[i]=='(')
            stack.push(i);
            if(chars[i]==')')
            {
                int leftpos=stack.pop();
                int rightpos=i;
                out.println(leftpos + "," + rightpos );
                String currentexp=exp.substring(leftpos, rightpos + 1);
                out.println(currentexp);
            }
        }
        System.out.println(stack);
        
    }
}
