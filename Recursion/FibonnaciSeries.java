package Recursion;

public class FibonnaciSeries {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }


    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        int[] fibCache = new int[n + 1];
        fibCache[1] = 1;
        fibCache[2] = 1;
        for (int i = 3; i <= n; i++) {
            fibCache[i] = fibCache[i - 1] + fibCache[i - 2];
        }
        return fibCache[n];
    }
}
