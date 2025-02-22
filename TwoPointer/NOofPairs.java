package TwoPointer;

import java.util.Arrays;

public class NOofPairs {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 10;
        System.out.println(pairSum(A, target));
    }

    public static int pairSum(int[] array, int target) {
        Arrays.sort(array);  // Ensure the array is sorted
        int start = 0;
        int end = array.length - 1;
        int pairCount = 0;
        while (start < end) {
            int sum = array[start] + array[end];
            if (sum == target) {
                pairCount++;
                start++;
                end--;
                while (start < end && array[start] == array[start - 1]) start++;
                while (start < end && array[end] == array[end + 1]) end--;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return pairCount;
    }
    
    // public static int numberOfPairsForSameNumber(int n) {
    //     return (int)Math.floor(n*(n+1)/2);
    // }
    
    
}