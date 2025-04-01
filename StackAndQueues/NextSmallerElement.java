package StackAndQueues;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] A = { 4, 10, 5, 8, 20, 15, 3, 12 };
        int[] result = findNextSmallerElements(A);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }

    public static int[] findNextSmallerElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() >= arr[i]) {
                st.pop();
            }
            result[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return result;
    }

    public static int[] indexOfNextSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            result[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        return result;
    }

    public static int[] distanceOfNextSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            result[i] = st.empty() ? -1 : st.peek() - i;
            st.push(i);
        }

        return result;
    }

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }
            result[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }   

        return result;
    }

}
