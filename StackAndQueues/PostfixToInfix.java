package StackAndQueues;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String s = "AB-DE+F*/";
        System.out.println(postfixToInfix(s));
    }

    private static String postfixToInfix(String s) {
        Stack<String> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                stack.push(Character.toString(ch));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + op2 + ch + op1 + ")");
            }
        }
        return stack.pop();
    }
}
