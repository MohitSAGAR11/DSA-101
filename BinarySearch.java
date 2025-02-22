import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = s.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }

       
        Arrays.sort(arr);

        System.out.print("Enter the target value: ");
        int target = s.nextInt();
        s.close();

        int result = binarySearch(target, arr);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }

    public static int binarySearch(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; 
            }
        }
        return -1; 
    }
}

//find k which is the max length ofsubarray such that there is no subarry of length k whose sum >= B
