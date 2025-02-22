import java.util.*;

public class SumOFQueryINmatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = s.nextInt();
            }
        }

        int[][] prefix = new int[N][M];
        for (int i = 0; i < N; i++) {
            int csum = 0;
            for (int j = 0; j <= M; j++) {
                csum += A[i][j];
                prefix[i][j] = csum;
            }
        }

        // if only border are added;

        // int Q = s.nextInt();
        // while(Q>0){
        // int srow = s.nextInt();
        // int scol = s.nextInt();
        // int erow = s.nextInt();
        // int ecol = s.nextInt();

        // int totalSum = (prefix[srow][ecol] - prefix[srow][scol]) +
        // (prefix[erow][ecol] - prefix[erow][scol]);
        // System.out.println(totalSum);

        // Q--;
        // }

        int Q = s.nextInt();
        int totalSum = 0;
        while (Q > 0) {
            int srow = s.nextInt();
            int scol = s.nextInt();
            int erow = s.nextInt();
            int ecol = s.nextInt();
            while (srow < erow) {
                if (scol == 0) {
                    totalSum += prefix[srow][ecol];
                }
                totalSum += (prefix[srow][ecol] - prefix[srow][scol - 1]) + (prefix[erow][ecol] - prefix[erow][scol - 1]);
                srow++;
            }
            Q--;
        }

        System.out.println(totalSum);
    }
}
