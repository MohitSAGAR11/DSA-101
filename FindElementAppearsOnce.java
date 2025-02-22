//all others appear twice

import java.util.Scanner;

public class FindElementAppearsOnce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        System.out.println(findElementAppearsOnce(A));
        s.close();
    }

    public static int findElementAppearsOnce(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0 && A[mid] != A[mid + 1]) {
                return A[mid];
            } else if (mid == A.length - 1 && A[mid] != A[mid - 1]) {
                return A[mid];
            } else if (A[mid] != A[mid - 1] && A[mid] != A[mid + 1]) {
                return A[mid];
            } else if (A[mid] == A[mid - 1]) {
                if ((mid - start) % 2 == 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if ((end - mid) % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
