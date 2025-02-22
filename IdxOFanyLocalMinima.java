import java.util.Scanner;

public class IdxOFanyLocalMinima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        System.out.println(findLocalMinima(A));
        s.close();
    }

    public static int findLocalMinima(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0 && A[mid] < A[mid + 1]) {
                return mid;
            } else if (mid == A.length - 1 && A[mid] < A[mid - 1]) {
                return mid;
            } else if (A[mid] < A[mid - 1] && A[mid] < A[mid + 1]) {
                return mid;
            } else if (A[mid] > A[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
//optimised one 
    static int solve(int A[]){
        int start = 0;
        int end = A.length - 1;
        while(start < end){
            int mid = start + ((end - start)/2);
            if (mid == 0 && A[mid] < A[mid + 1]) {
                return mid;
            } else if (mid == A.length - 1 && A[mid] < A[mid - 1]) {
                return mid;
            }
            if(A[mid] < A[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
