// find the floor of the square root of a target element in a sorted array
import java.util.Scanner;

public class FindFloorOfRootTarget {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int target = s.nextInt();
        System.out.println(findFloorOfRoot(A, target));
        s.close();
    }

    public static int findFloorOfRoot(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0 && A[mid] * A[mid] <= target) {
                return mid;
            } else if (mid == A.length - 1 && A[mid] * A[mid] <= target) {
                return mid;
            } else if (A[mid] * A[mid] <= target && A[mid + 1] * A[mid + 1] > target) {
                return mid;
            } else if (A[mid] * A[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }    

}
