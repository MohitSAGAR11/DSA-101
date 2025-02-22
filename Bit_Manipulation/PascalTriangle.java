package Bit_Manipulation;

public class PascalTriangle {
    public static void main(String[] args) {
        //Sum of nth row of pascal triangle is 2^n-1;
        int n = 5;
        System.out.println(1 << (n-1));
    }
}
