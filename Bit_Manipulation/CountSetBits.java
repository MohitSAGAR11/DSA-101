package Bit_Manipulation;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
           count++;
           n = n & (n-1);
        }
        return count;
    }

    public static int countSetBits2(int n){
        int count = 0;
        while(n > 0){
           if((n & 1) == 1){
               count++;
           }
           n = n >> 1;
        }
        return count;
    }

    public static int countSetBits3(int n){
        int count = 0;
        for(int i = 0 ; i<32 ; i++){
            if((n & (1 << i)) != 0){
                count++;
            }
        }
        return count;
    }
}
