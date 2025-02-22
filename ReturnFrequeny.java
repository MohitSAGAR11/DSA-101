import java.util.*;

public class ReturnFrequeny {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        int query = 3;
        System.out.println(frequency(A, query));

    }

    public static int frequency(int[] A, int query) {
        Set<Integer> set = new HashSet<>();
        int count = 1;
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i]) && A[i] == query) {
                count++;
            } else {
                set.add(A[i]);
            }
        }
        return count;

    }

    // using hashmap
    public static int frequencyUsingMap(int[] A, int query) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        return map.getOrDefault(query, 0);
    }
}
