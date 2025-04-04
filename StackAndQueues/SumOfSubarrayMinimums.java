package StackAndQueues;

import java.util.Stack;

public class SumOfSubarrayMinimums {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,3,7,8,1};
        System.out.println(sumSubarrayMins(arr));
    }

    public static int sumSubarrayMins(int[] arr) {
        int sum = 0;
        int[] prev = previousSmallerElement(arr);
        int[] next = nextSmallerElement(arr);

        for (int i = 0; i < arr.length; i++) {
           sum = (sum + (arr[i] * (i - prev[i]) * (next[i] - i) ) % 1000000007) % 1000000007;
        }
        return sum;
    }

    public static int[] nextSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            result[i] = st.empty() ? arr.length : st.peek();
            st.push(i);
        }
        return result;
    }

    public static int[] previousSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = 0 ; i<arr.length ; i++) {
            while(!st.empty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            result[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        return result;
    }



}
