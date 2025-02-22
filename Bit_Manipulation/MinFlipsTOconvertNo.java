package Bit_Manipulation;

public class MinFlipsTOconvertNo {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println(minFlips(a, b));
    }

    public static int minFlips(int a, int b) {
        int XOR = a ^ b;
        int count = countSetBits(XOR);
        return count;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
           if((n & 1) == 1){
               count++;
           }
           n = n >> 1;
        }
        return count;
    }

    
}
