package StackAndQueues;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "F+D-C*(B+A)"; 
        System.out.println(infixToPostfix(s));
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }


    public static String infixToPostfix(String exp) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
