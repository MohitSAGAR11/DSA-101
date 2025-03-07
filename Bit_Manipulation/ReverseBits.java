package Bit_Manipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result |= (n & 1) << (31 - i);
            n >>= 1;
        }
        return result;
    }
}
