package stackspackage;

import java.util.Stack;

public class InfixToPostix {

    static boolean isOperator(char ch) {
        if (ch == '+' || ch == '/' || ch == '*' || ch == '-') {
            return true;
        }
        return false;
    }

    static boolean isOperand(char ch) {
        if (isOperator(ch)) {
            return false;
        }
        if (ch == '(' || ch == ')') {
            return false;
        }
        return true;
    }

    static int precedence(char ch) {
        if (ch == '-') {
            return 0;
        }
        if (ch == '+') {
            return 1;
        }
        if (ch == '*') {
            return 2;
        }
        if (ch == '/') {
            return 3;
        }
        return -1;

    }

    public static void main(String[] args) {
        String expression = "1+2*7";
        expression = "(" + expression.trim() + ")";

        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        int n = expression.length();
        for (int i = 0; i <= n - 1; i++) {
            char ch = expression.charAt(i);

            //***********Operand*****************
            if (isOperand(ch)) {
                output.append(ch);
                continue;
            }
            //***********Operand*****************
            //***********Opening Bracket*****************
            if (ch == '(') {
                stack.push(ch);
                continue;
            }
            //***********Opening Bracket*****************
            //***********Closing Bracket*****************
            if (ch == ')') {
                char outch = stack.pop();
                while (outch != '(') {
                    output.append(outch);
                    outch = stack.pop();
                }
                continue;
            }
            //***********Closing Bracket*****************

            //***********Operator*****************
            if (isOperator(ch)) {
                int currentoperatorprecedence = precedence(ch);
                while (true) {
                    if (stack.isEmpty()) {
                        break;
                    }
                    char outch = stack.pop();
                    if (precedence(outch) >= currentoperatorprecedence) {
                        output.append(outch);
                        continue;
                    } else {
                        stack.push(outch);
                        break;
                    }
                }
                stack.push(ch);
            }

            //***********Operator*****************
        }
//******************End of for loop*************
        System.out.println(new String(output));
    }
}
