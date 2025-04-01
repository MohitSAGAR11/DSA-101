package Recursion;

import java.util.ArrayList;

public class PrintSubsequenceOfSumK {
    public static void main(String[] args) {
        int[] A = { 1, 2, 1 };
        int K = 2;
        print(0, new ArrayList<>(), 0, K, A);
        printonlyOne(0, new ArrayList<>(), 0, K, A);
        System.out.println(count(0, new ArrayList<>(), 0, K, A));
    }

    public static void print(int index, ArrayList<Integer> Arr, int sum, int K, int[] A) {
        if (index == A.length) {
            if (sum == K) {
                System.out.println(Arr);
            }
            return;
        }
        Arr.add(A[index]);
        sum += A[index];
        print(index + 1, Arr, sum, K, A);
        Arr.remove(Arr.size() - 1);
        sum -= A[index];
        print(index + 1, Arr, sum, K, A);
    }

    public static boolean printonlyOne(int index, ArrayList<Integer> Arr, int sum, int K, int[] A) {
        if (index == A.length) {
            if (sum == K) {
                System.out.println(Arr);
                return true;
            } else
                return false;
        }

        Arr.add(A[index]);
        sum += A[index];

        if (printonlyOne(index + 1, Arr, sum, K, A) == true)
            return true;
        Arr.remove(Arr.size() - 1);
        sum -= A[index];

        if (printonlyOne(index + 1, Arr, sum, K, A) == true)
            return true;

        return false;
    }

    public static int count(int index, ArrayList<Integer> Arr, int sum, int K, int[] A) {
        if (index == A.length) {
            if (sum == K) {
                return 1;
            } else
                return 0;
        }

        Arr.add(A[index]);
        sum += A[index];

        int left = count(index + 1, Arr, sum, K, A);
        Arr.remove(Arr.size() - 1);
        sum -= A[index];

        int right = count(index + 1, Arr, sum, K, A);

        return left + right;
    }

}
