import java.util.*;

public class MinimumDistanceBwDuplicates {
    public static void main(String[] args) {
        int[] A = { 3,5,2,3,6,5,5,2,3};
        
        System.out.println(minDistance(A));
    }

    public static int minDistance(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                min = Math.min(min, i - map.get(A[i]));
                map.put(A[i], i);
            } else {
                map.put(A[i], i);
            }            
        }
        return min;
    }
}
