package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] A = { 64, 34, 25, 12, 22, 11, 90 };
        selectionSort(A, A.length - 1, 0, 0);
        System.out.println(Arrays.toString(A));
    }

    static void selectionSort(int[] A, int r , int c , int max) {
        if(r == 0) return;

        if(c < r){

            if(A[c] > A[max]){
                selectionSort(A, r, c+1, c);
            } else {
                selectionSort(A, r, c+1, max);
            }
        }
        else{
            int temp = A[r-1];
            A[r-1] = A[max];
            A[max] = temp;
            selectionSort(A, r-1, 0, 0);
        }

    }
}
