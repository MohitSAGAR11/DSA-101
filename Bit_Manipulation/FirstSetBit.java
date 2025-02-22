package Bit_Manipulation;

public class FirstSetBit {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(firstSetBit(n));
    }

    public static int firstSetBit(int n) {
        return n & (-n);
    }
}
