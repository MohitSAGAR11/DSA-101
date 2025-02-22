import java.util.HashMap;
import java.util.Map;

public class checkSubarrayForSumK {
    public static void main(String[] args) {
        // given an array A, find if there is a subarray with sum K
        int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int K = 7;
        System.out.println(SubarraySumK(A, K));

    }

    public static boolean SubarraySumK(int[] A, int K) {
        // solve using hashmap
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum == K || map.containsKey(sum - K)) {
                return true;
            }
            map.put(sum, i);
        }
        return false;
    }

    //sum divisible by K
    public static boolean SubarraySumK2(int[] A, int K) {
        // solve using hashmap
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            sum %= K;
            if (sum == 0 || map.containsKey(sum)) {
                return true;
            }
            map.put(sum, i);
        }
        return false;
    }                   
}
