package StackAndQueues;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public QueueUsingStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        int pop = s2.pop();
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return pop;
    }

    public int peek() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        int peek = s2.peek();

        while (!s2.empty()) {
            s1.push(s2.pop());
        }

        return peek;
    }

    public boolean empty() {
        return s1.empty();
    }

}
