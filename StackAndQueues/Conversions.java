package StackAndQueues;

import java.util.*;

public class Conversions {
    public static void main(String[] args) {
        String[] input = { "4", "/", "2", "*", "3" };
        String[] output = infixToPostfix(input);

        for (String s : output) {
            System.out.print(s + " ");
        }
    }

    // Define operator precedence.
    public static int precedence(char ch) {
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

    public static boolean isOperand(String ch) {
        return ch.matches("[A-Za-z0-9]+");
    }

    public static String[] infixToPostfix(String[] s) {
        Stack<String> st = new Stack<>();
        List<String> output = new ArrayList<>();

        for (String ch : s) {
            if (isOperand(ch)) {
                output.add(ch);
            } else {
                while (!st.isEmpty() && precedence(ch.charAt(0)) <= precedence(st.peek().charAt(0))) {
                    output.add(st.pop());
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            output.add(st.pop());
        }

        return output.toArray(new String[0]);
    }
}
