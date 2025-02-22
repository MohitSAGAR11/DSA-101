package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] A = { 64, 34, 25, 12, 22, 11, 90 };
        int[] B = mergeSort(A, 0, A.length-1);
        System.out.println(Arrays.toString(B));
    }

    static int[] mergeSort(int[] A, int l, int r) {
        if (l == r) return new int[] { A[l] };

        int mid = l + (r - l) / 2;
        int[] left = mergeSort(A, l, mid);
        int[] right = mergeSort(A, mid + 1, r);

        return merge(left, right);
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
