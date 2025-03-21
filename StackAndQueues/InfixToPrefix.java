package StackAndQueues;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "(A+B)*C-D+F";
        String res = reverse(s);  // Step 1: Reverse and fix brackets
        String postfix = infixToPostfix(res);  // Step 2: Convert to postfix
        String prefix = reverse(postfix);  // Step 3: Reverse postfix to get prefix
        System.out.println(prefix);
    }

    // Function to reverse the string and fix brackets
    private static String reverse(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            // Swap characters first
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Fix brackets
            if (arr[left] == '(') arr[left] = ')';
            else if (arr[left] == ')') arr[left] = '(';
            
            if (arr[right] == '(') arr[right] = ')';
            else if (arr[right] == ')') arr[right] = '(';

            left++;
            right--;
        }
        
        return new String(arr);
    }

    // Operator precedence function
    private static int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3; // Right associative
        }
        return -1;
    }

    // Convert infix to postfix
    public static String infixToPostfix(String exp) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) { // Operand
                sb.append(ch);
            } else if (ch == '(') { // Left parenthesis
                st.push(ch);
            } else if (ch == ')') { // Right parenthesis
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop(); // Remove '(' from stack
                }
            } else { // Operator
                while (!st.isEmpty() && precedence(ch) < precedence(st.peek()) ||
                       (!st.isEmpty() && precedence(ch) == precedence(st.peek()) && ch != '^')) {
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString(); // No need to reverse here
    }
}
