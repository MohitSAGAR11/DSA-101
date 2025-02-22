import java.util.HashMap;
import java.util.Map;

public class SubarraySumZero {
    public static void main(String[] args) {
        // given an array A, find if there is a subarray with sum 0
        int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        System.out.println(ZeroSum(A));

    }

    public static boolean ZeroSum(int[] A) {
        // solve using hashmap
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum == 0 || map.containsKey(sum)) {
                return true;
            }
            map.put(sum, i);
        }
        return false;
    }

    // if repeated value of prefix sum then also there is a subarray with sum 0
    public static boolean ZeroSum2(int[] A) {
        // solve using hashmap
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] == 0 || map.containsKey(prefix[i])) {
                return true;
            }
            map.put(prefix[i], i);
        }
    }

    //count subarrays with sum 0
    public static int ZeroSum3(int[] A) {
        // solve using hashmap
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] == 0) {
                count++;
            }
            if (map.containsKey(prefix[i])) {
                count += map.get(prefix[i]);
            }
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
    }

    //length of  longest subarray with sum 0
    public static int ZeroSum4(int[] A) {
        // solve using hashmap
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] == 0) {
                max = i + 1;
            }
            if (map.containsKey(prefix[i])) {
                max = Math.max(max, i - map.get(prefix[i]));
            } else {
                map.put(prefix[i], i);
            }
        }
    }
}
