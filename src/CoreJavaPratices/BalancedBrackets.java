package CoreJavaPratices;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }

                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false; // Mismatched brackets
                }
            }
        }

        return stack.isEmpty(); // If stack is empty, all brackets were matched
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String str1 = "({[]})";
        String str2 = "({[}])";

        System.out.println(str1 + " is balanced: " + isBalanced(str1));
        System.out.println(str2 + " is balanced: " + isBalanced(str2));
    }
}