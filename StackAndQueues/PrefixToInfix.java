package StackAndQueues;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String s = "*+PQ-MN";
        System.out.println(prefixToInfix(s));
    }

    private static String prefixToInfix(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = s.length()-1 ; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                stack.push(Character.toString(ch));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + op1 + ch + op2 + ")");
            }
        }
        return stack.pop();
    }
}
