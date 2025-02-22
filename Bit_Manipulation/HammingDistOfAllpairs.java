package Bit_Manipulation;

public class HammingDistOfAllpairs {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int ans = 0;
        // for(int i = 0 ; i<A.length ; i++){
        //     for(int j = i+1 ; j<A.length ; j++){
        //         ans += hammingDistance(A[i], A[j]);
        //     }
        // }

        // for(int i = 0 ; i<A.length ; i++){
        //     for(int j = i+1 ; j<A.length ; j++){
        //         ans += setBits2(A[i]^A[j]);
        //     }
        // }
        // System.out.println(ans); 
        
        for(int i = 0 ; i<32 ; i++){
            int count = check(A, i);
            ans += count*(A.length-count);
        }
        System.out.println(ans);
    }


    // sum of Total no of (setbits*unsetbits) in each iteration from 0 to 32 in each no of the array

    static int hammingDistance(int x, int y){    
        int ans = 0;
        int m = Math.max(x, y);
        while (m>0) {
            int c1 = x & 1;
            int c2 = y & 1;
            if (c1 != c2)
                ans += 1;
            m = m >> 1;
            x = x >> 1;
            y = y >> 1;
        }
        return ans;
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


    static int setBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    static int setBits2(int n){
        int count = Integer.bitCount(n);
        return count;
    }
}
