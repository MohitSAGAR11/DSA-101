package Bit_Manipulation;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(removeLastSetBit(n));
    }

    public static int removeLastSetBit(int n) {
        return n & (n - 1);
    }
}
