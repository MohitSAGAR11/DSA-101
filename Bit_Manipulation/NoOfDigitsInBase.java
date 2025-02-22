package Bit_Manipulation;

public class NoOfDigitsInBase {
    public static void main(String[] args) {
        int n = 10;
        int base = 2;
        System.out.println(noOfDigits(n, base));
    }

    public static int noOfDigits(int n, int base) {
        int digit = (int)(Math.log(n) / Math.log(base)) + 1;
        return digit;
    }
}
