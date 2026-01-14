package DataStructure.StacksAndQueues;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); ++i) {
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if(curr == ')' && last != '(') {
                    return false;
                } else if(curr == '}' && last != '{') {
                    return false;
                } else if(curr == ']' && last != '[') {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {

    }
}
