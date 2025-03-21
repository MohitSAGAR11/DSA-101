package StackAndQueues;

import java.util.Stack;

public class BalencedParenthesis {
    public static void main(String[] args) {
    String str = "()[{}()]";
    Stack<Character> stack = new Stack<>();

    for (char ch : str.toCharArray()) {
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
        } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(' ||
                   ch == '}' && !stack.isEmpty() && stack.peek() == '{' ||
                   ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
            stack.pop();
        } else {
            System.out.println("Not Balanced");
            return;
        }
    }

    System.out.println(stack.isEmpty() ? "Balanced" : "Not Balanced");
}
}
