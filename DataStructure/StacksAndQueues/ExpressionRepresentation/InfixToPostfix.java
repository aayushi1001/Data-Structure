package DataStructure.StacksAndQueues.ExpressionRepresentation;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {

    public int precedence(char ch) {
        if(ch == '^') {
            return 3;
        } else if(ch == '*' || ch == '/' || ch == '%') {
            return 2;
        } else if(ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }

    // if ( - insert
    // if ) - pop till (
    // if sign - pop till precedence dec
    // if operand - print directly
    // when precedence is equal, associativity comes
    // All other than ^ mis left associative, so works fine
    // Need only exception for ^
    public String convertToPostfix(String str) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); ++i) {
            char curr = str.charAt(i);
            if(curr == '(') {
                stack.push(curr);
            } else if(curr == ')') {
                while(stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.pop();
            } else if (Character.isLetterOrDigit(curr)) {
                ans.append(curr);
            } else {
                if (stack.isEmpty() ||
                    precedence(stack.peek()) < precedence(curr) ||
                    (stack.peek() == '^' && curr == '^')) {
                    stack.push(curr);
                } else {
                    while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(curr)) {
                        ans.append(stack.pop());
                    }
                    stack.push(curr);
                }
            }
        }

        while(!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        InfixToPostfix exp = new InfixToPostfix();
        System.out.println(exp.convertToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
