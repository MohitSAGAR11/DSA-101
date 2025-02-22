import java.util.Scanner;

public class SearchInRotatedArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter the number of elements: ");
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = s.nextInt();
        System.out.println(search(A, target));
        s.close();
    }

    public static int search(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (A[start] <= A[mid]) {
                if (target >= A[start] && target < A[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > A[mid] && target <= A[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
