import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {
    public static void main(String[] args) {
        int[] A = {3,1,2,1,5,6,2,3};
        System.out.println(NonRepeating(A));
    }
    
    public static int NonRepeating(int[] A){
        //make a frequency map of the array and map each element to its maximum index
        //solve using hashmap;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], -1);
            } else {
                map.put(A[i], i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i: map.keySet()){
            if(map.get(i) != -1){
                min = Math.min(min, map.get(i));
            }
        }
        return A[min];
    }

    
}
