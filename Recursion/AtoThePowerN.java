package Recursion;

public class AtoThePowerN {
    public static void main(String[] args) {
        int A = 2;
        int N = 5;
        long result = power2(A, N);
        System.out.println(result);
    }

    public static long power(int A, int N) {
        if (N == 0 || A == 1) return 1;
        if (N % 2 == 0) return power(A, N / 2) * power(A, N / 2);
        else return A * power(A, N / 2) * power(A, N / 2);
    }

    public static long power2(int A, int N) {
        if (N == 0) return 1;
        if (N % 2 == 0) {
            long halfPiece = power2(A, N / 2);
            return halfPiece * halfPiece;
        } else {
            long halfPiece = power2(A, N / 2);
            return A * halfPiece * halfPiece;
        }
    }
}







