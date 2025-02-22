package Bit_Manipulation;

public class MaxANDpair {
    public static void main(String[] args) {
        int[] A = {20,18,27};
        System.out.println(maxAND(A));
    }

    static int maxAND(int[] A){
        int res = 0;
        for(int i = 31 ; i>=0 ; i--){
            int count = check(A, i);
            if(count>=2){
                res = res | (1<<i);
            }
        }
        return res;
    }

    static int check(int[] A, int i){
        int count = 0;
        for(int j = 0 ; j<A.length ; j++){
            if((A[j] & (1<<i)) != 0){
                count++;
            }
        }
        return count;
    }
}
