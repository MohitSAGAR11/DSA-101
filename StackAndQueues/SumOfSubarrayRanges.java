package StackAndQueues;

import java.util.Stack;

public class SumOfSubarrayRanges {
    public static void main(String[] args) {
        int[] A = { 1, 4, 3, 2 };
        System.out.println(sumSubarrayRanges(A));
    }

    public static long sumSubarrayRanges(int[] A) {
        int n = A.length;
        int mod = 1000000007;

        // Compute indices for next and previous smaller/greater elements.
        int[] prevSmaller = previousSmallerElement(A);
        int[] nextSmaller = nextSmallerElement(A);
        int[] prevGreater = prevGreaterElement(A);
        int[] nextGreater = nextGreaterElement(A);

        long maxSum = 0; // Sum of subarray maximum contributions
        long minSum = 0; // Sum of subarray minimum contributions

        // Calculate contribution of each element.
        for (int i = 0; i < n; i++) {
            // For maximum: use previous and next greater
            long leftMax = i - prevGreater[i];
            long rightMax = nextGreater[i] - i;
            maxSum = (maxSum + A[i] * leftMax % mod * rightMax % mod) % mod;

            // For minimum: use previous and next smaller
            long leftMin = i - prevSmaller[i];
            long rightMin = nextSmaller[i] - i;
            minSum = (minSum + A[i] * leftMin % mod * rightMin % mod) % mod;
        }

        // The answer is the difference between maxSum and minSum.
        long ans = (maxSum - minSum) % mod;
        if (ans < 0)
            ans += mod;
        return ans;
    }

    public static int[] previousSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] prev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            prev[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        return prev;
    }

    public static int[] nextSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] next = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            next[i] = st.empty() ? arr.length : st.peek();
            st.push(i);
        }
        return next;
    }

    public static int[] prevGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] prev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            prev[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        return prev;
    }

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] next = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            next[i] = st.empty() ? arr.length : st.peek();
            st.push(i);
        }
        return next;
    }
}

class Solution {
    public int[] asteroidCollision(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int a : asteroids) {
            if (a > 0) {
                list.add(a);
            } else {
                while (!list.isEmpty() && list.get(list.size() - 1) > 0 && list.get(list.size() - 1) < -a)
                    list.remove(list.size() - 1);
                if (list.isEmpty() || list.get(list.size() - 1) < 0)
                    list.add(a);
                else if (list.get(list.size() - 1) == -a)
                    list.remove(list.size() - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}