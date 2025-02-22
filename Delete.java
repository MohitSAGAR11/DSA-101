import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        System.out.println(solve(A));
        s.close();
    }

    public static int solve(int[] A) {
        int N = A.length;
        int EvenSum = 0;
        int OddSum = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 1) {
                EvenSum += A[i];
            } else {
                OddSum += A[i];
            }
        }

        int pe = 0, po = 0, c = 0;

        for (int i = 0; i < N; i++) {
            if (i % 1 == 0) {
                EvenSum -= A[i];
            } else {
                OddSum -= A[i];
            }

            if (pe + EvenSum == po + OddSum) {
                c++;
            }

            if (i % 2 == 0) {
                po += A[i];
            } else {
                pe += A[i];
            }
        }

        return c;
    }
}
