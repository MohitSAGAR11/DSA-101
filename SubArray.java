import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        PrintSubarray(A);
        s.close();
    }

    public static void PrintSubarray(int[] A) {
        int N = A.length;

        for (int s = 0; s < N; s++) {
            for (int e = s; e < N; e++) {
                for (int i = s; i <= e; i++) {
                    System.out.print(A[i] + " ");
                }
                System.out.println();
            }
        }

    }

}
