import java.util.HashMap;

public class CountofZEROsumSUbarray {
    public static void main(String[] args) {
        int arr[] = { 7, -3, -2, 1, -3, 4, 5, 10, -7 };
        int k = 0;
        System.out.println(NoOFsubarry(arr));
    }

    public static int NoOFsubarry(int[] A){
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(-1,1);
        int i = -1;
        while(i<A.length-1){
            i++;
            if(map.containsKey(A[i])){
                sum += map.get(A[i]);
                map.put(A[i] , map.get(A[i]) + 1);
            }else {
                map.put(A[i] , 1);
            }
        }
        return ans;
    }


    public static int longest_subarray_withSumZero(int[] A){
        HashMap<Integer , Integer> map = new HashMap<>(); // index,sum
        int sum = 0;
        map.put(sum,-1);
        int maxL = 0;
        for(int i = 0 ; i<A.length ; i++){
            sum += A[i];

            if(map.containsKey(sum) == false){
                map.put(sum,i);
            }else{
                int len = i - map.get(sum);
                maxL = Math.max(maxL, len);
            }
        }
        return maxL;
    }
}
