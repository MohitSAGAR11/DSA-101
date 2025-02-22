package Bit_Manipulation;

import java.util.Arrays;

public class MinZORpair {
    public static void main(String[] args) {
        int[] A = { 3, 1, 4, 5, 2 };
        // int ans = Integer.MAX_VALUE;
        System.out.println(findMinXorPair(A));

    }

    static int minZOR(int[] A) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                ans = Math.min(ans, A[i] ^ A[j]);
            }
        }
        return ans;
    }

    public static int findMinXorPair(int[] arr) {
        Arrays.sort(arr);
        int minXor = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            minXor = Math.min(minXor, arr[i] ^ arr[i+1]);
        }

        return minXor;

    }
}