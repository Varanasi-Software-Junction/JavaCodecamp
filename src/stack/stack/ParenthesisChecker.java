package stack.stack;

import java.util.Stack;

public class ParenthesisChecker {

    public static boolean isParenthesisOk(String expression) {
        Stack<Character> st = new Stack<>();
        int n = expression.length();
        for (int i = 0; i <= n - 1; i++) {
            char ch = expression.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
                System.out.println(st);
                continue;
            }
            if (ch == '}' || ch == ']' || ch == ')') {
                if (st.empty()) {
                    return false;
                }
                char outchar = st.pop();
                if (ch == ']' && outchar != '[') {
                    return false;
                }
                if (ch == '}' && outchar != '{') {
                    return false;
                }
                if (ch == ')' && outchar != '(') {
                    return false;
                   
                } 
                continue;
            }
            return false;
        }
        return st.empty();

    }

    public static void main(String[] args) {
        String expression = "[()]{}{[()()]()}";
        boolean result = isParenthesisOk(expression);
        System.out.println(result);

    }
}
