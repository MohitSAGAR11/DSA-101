import java.util.*;

public class ReturnIJpairs {
    public static void main(String[] args) {
        int[] A = { 2,3,7,5,4,5,6,8,6,5};
        int k = 10;
        // int total = 0;
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < A.length; i++) {
        //     if (map.containsKey(A[i])) {
        //         map.put(A[i], map.get(A[i]) + 1);
        //     } else {
        //         map.put(A[i], 1);
        //     }

        //     total += map.get(A[i]) - 1;
        // }
        // System.out.println(total);
        System.out.println(countPairs(A, k));
    }

    // Pair such that their sum is k; 
    public static int countPairs(int[] A, int k){
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.length; i++){
            if(map.containsKey(k-A[i])){
                count += map.get(k-A[i]);
            }
            map.put(A[i], map.getOrDefault(A[i], 0)+1);
        }
        return count;
      }
}


 