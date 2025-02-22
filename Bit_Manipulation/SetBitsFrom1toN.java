package Bit_Manipulation;

public class SetBitsFrom1toN {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(countSetBits(n));
    }

    public static int largestPowerOf2(int n){
        int x = 0;
        while((1 << x) <= n){
            x++;
        }
        return x - 1;
    }

    public static int countSetBits(int n){
        if (n == 0) return 0;  
        
        int x = largestPowerOf2(n);
        int bitsUpto2x = x * (1 << (x - 1));
        int msb2xton = n - (1 << x) + 1;
        int rest = n - (1 << x);

        return bitsUpto2x + msb2xton + countSetBits(rest);
    }
}
