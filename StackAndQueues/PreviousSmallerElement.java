package StackAndQueues;

import java.util.Stack;

public class PreviousSmallerElement {

    public static void main(String[] args) {
        int[] arr = {4, 10, 5, 8, 20, 15, 3, 12};
        int[] result = findPreviousSmallerElements(arr);

        for (int res : result) {
            System.out.print(res + " ");
        }
    }

    public static int[] findPreviousSmallerElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return result;
    }
}

