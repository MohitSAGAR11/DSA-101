package StackAndQueues;

import java.util.Stack;

public class InndexOfpreviousSmaller {
    public static void main(String[] args) {
        int[] A = { 4, 10, 5, 8, 20, 15, 3, 12 };
        int[] result = indexOfpreviousSmaller(A);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }

    public static int[] indexOfpreviousSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}
