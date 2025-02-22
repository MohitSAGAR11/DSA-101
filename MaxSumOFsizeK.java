import java.util.Scanner;

public class MaxSumOFsizeK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int k = s.nextInt();
        opt(A, k);
        s.close();
    }

    // public static void MaxSumOFsubarryOFsizeK(int[] A, int k) {
    //     int N = A.length;
    //     int max = 0;
    //     for (int i = 0; i < N; i++) {
    //         int start = i;
    //         int sum = 0;
    //         for (int j = i; j < N; j++) {
    //             int end = j;
    //             sum += A[j];
    //             if (end - start == k) {
    //                 max = Math.max(max, sum);
    //             }

    //         }

    //     }
    //     System.out.println(max);
    // }

    public static void opt(int[] A, int k) {
        int N = A.length;
        int win = 0;
        for (int i = 0; i < k; i++) {
            win += A[i];
        }
        int MaxSum = win;
        int s = 0, e = k;
        while (e < N) {
            win = win - A[s] + A[e];
            MaxSum = Math.max(MaxSum, win);
            e++;
            s++;
        }
        System.out.println(MaxSum);
    }

    
}
