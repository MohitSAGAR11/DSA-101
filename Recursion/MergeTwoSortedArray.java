package Recursion;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] A = { 3, 8, 15, 20 };
        int[] B = { 1, 2, 3, 9, 11, 18, 19, 21, 30, 40 };

        System.out.println(Arrays.toString(merge(A, B)));
    }

    static int[] merge(int[] A, int[] B) {
        int[] merged = new int[A.length + B.length];
        
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) merged[k++] = A[i++];
            else merged[k++] = B[j++];
        }

        while (i < A.length) merged[k++] = A[i++];
        while (j < B.length) merged[k++] = B[j++];
        return merged;
    }

    
}
