package Recursion;

import java.util.Arrays;

class MergeTwoSortedSubarray{
    public static void main(String[] args) {
        int[] A = {8,1,3,6,11,2,4,9,7,6};
        Merged(A, 1, 7);
        System.out.println("Sorted Array: "+Arrays.toString(A));
    }

    static void Merged(int[] A, int l, int r) {
        //using Merged sort
        int mid = l + (r-l)/2;
        Merged(A, l, mid);
        Merged(A, mid+1, r);
        merge(A, l, mid, r);
    }


    public static void merge(int[] arr, int start1, int end1, int end2) {
        int i = start1, j = end1 + 1;

        while (i <= end1 && j <= end2) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                // Insertion sort-like shifting
                int temp = arr[j];
                int k = j;
                
                // Shift elements to the right to make space
                while (k > i) {
                    arr[k] = arr[k - 1];
                    k--;
                }
                
                arr[i] = temp;

                // Update pointers
                i++;
                end1++; // The sorted part extends by 1
                j++;
            }
        }
    }

}