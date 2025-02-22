import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Distinct_Elements_In_Window {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 3, 5, 6, 2, 5, 5, 7 };
        int k = 4;
        System.out.println(solution(arr, k));   
    }

    public static ArrayList<Integer> solution(int[] A , int k){
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<k-1 ; i++){
            map.put(A[i] , map.getOrDefault(A[i],0)+1);
        }

        for(int j = 0 , i = k-1 ; i<A.length){
            map.put(A[i] , map.getOrDefault(A[i], 0)+1);//Acquire
            list.add(map.size());
            i++;
            int freq = map.get(A[j]);
            if(freq == 1){
                map.remove(A[j]);
            }else{
                map.put(A[j] , freq - 1);
            }
            i++;
            j++;
        }

        return list;
    }
}
