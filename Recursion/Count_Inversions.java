package Recursion;

import java.util.Arrays;

public class Count_Inversions {

    // Global variable to store the inversion count
    static int inversionCount = 0;

    public static void main(String[] args) {
        int[] A = {5,3,2,4,1};
        int[] B = mergeSort(A, 0, A.length - 1);
        
        System.out.println("Sorted Array: " + Arrays.toString(B));
        System.out.println("Number of Inversions: " + inversionCount);
    }

    static int[] mergeSort(int[] A, int l, int r) {
        if (l == r) return new int[]{A[l]};

        int mid = l + (r - l) / 2;
        int[] left = mergeSort(A, l, mid);
        int[] right = mergeSort(A, mid + 1, r);

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
                // Count inversions: All remaining elements in left[] are greater than right[j]
                inversionCount += (left.length - i);
            }
        }

        while (i < left.length) merged[k++] = left[i++];
        while (j < right.length) merged[k++] = right[j++];
        
        return merged;
    }
}
