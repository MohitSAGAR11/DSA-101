package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        s.close();
        quickSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    static void quickSort(int[] A, int start, int end) {
        if (start >= end)
            return;

        int s = start;
        int e = end;
        int mid = s + (e - s) / 2;
        int pivot = A[mid];
        // also a reason if its already sorted it will not sort;
        while (s <= e) {
            while (s <= end && A[s] < pivot)
                s++;
            while (e >= start && A[e] > pivot)
                e--;

            if (s <= e) {
                int temp = A[s];
                A[s] = A[e];
                A[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct place;
        // plz sort othr 2 halves;
        quickSort(A, start, e);
        quickSort(A, s, end);

    }
}
