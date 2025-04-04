package StackAndQueues;

import java.util.Stack;

public class LargestAreaInHistogram {
    public static void main(String[] args) {
        int[] A = {2, 4};
        System.out.println(new LargestAreaInHistogram().largestRectangleArea(A));
    }

    public int largestRectangleArea(int[] heights) {
        int[] next = nextSmallerElement(heights);
        int[] prev = previousSmallerElement(heights);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int area = heights[i] * (next[i] - prev[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }

    public int[] nextSmallerElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return result;
    }

    public int[] previousSmallerElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return result;
    }
}
