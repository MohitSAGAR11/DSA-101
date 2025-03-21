package StackAndQueues;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String s = "AB-DE+F*/";
        System.out.println(postfixToPrefix(s));
    }

    private static String postfixToPrefix(String s) {
        Stack<String> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                stack.push(Character.toString(ch));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + ch + op1 + op2 + ")");
            }
        }
        return stack.pop();
    }
}
