package StackAndQueues;

public class StackUsingArray {
    public static void main(String[] args) {
        int size = 10;
        int[] stack = new int[size];
        int ptr = -1;

        push(stack, ptr, 10);
        push(stack, ptr, 20);
        push(stack, ptr, 30);
        push(stack, ptr, 40);
        push(stack, ptr, 50);

        System.out.println(pop(stack, ptr));
    }

    static int size(int[] stack, int ptr) {
        return ptr + 1;
    }
    static void push(int[] stack, int ptr, int item) {
        stack[++ptr] = item;
    }

    static int pop(int[] stack, int ptr) {
        return stack[ptr--];
    }

    static boolean isEmpty(int[] stack, int ptr) {
        return ptr == -1;
    }

    static int peek(int[] stack, int ptr) {
        return stack[ptr];
    }
}
