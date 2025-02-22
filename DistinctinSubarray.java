import java.util.HashMap;
import java.util.Map;

public class DistinctinSubarray {
    public static void main(String[] args) {
        //given an array A and an integer k, find the number of distinct elements in each subarray of size k
        int[] A = {3,2,1,3,5,6,2,5,5,7};
        int k = 4;
        System.out.println(Distinct(A, k));
    }

    public static int[] Distinct(int[] A, int k){
        //solve using hashmap
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<k; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
                count++;
            }
        }
        int[] res = new int[A.length-k+1];
        res[0] = count;
        for(int i=k; i<A.length; i++){
            if(map.get(A[i-k]) == 1){
                map.remove(A[i-k]);
                count--;
            } else {
                map.put(A[i-k], map.get(A[i-k])-1);
            }
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
                count++;
            }
            res[i-k+1] = count;
        }
        return res;
    }
}
