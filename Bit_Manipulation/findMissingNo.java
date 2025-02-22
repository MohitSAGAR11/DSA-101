package Bit_Manipulation;

public class findMissingNo {
    public static void main(String[] args) {
        int[] arr = {3,6,1,4,2,7};
        int N = arr.length;
        int result = 0;
        for(int i = 1 ; i<=N+1 ; i++){
            result ^= i;
        }
        for(int i = 0 ; i<N ; i++){
            result ^= arr[i];
        }
        System.out.println(result);
    }
}
