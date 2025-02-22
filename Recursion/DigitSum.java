package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int A = 1999999999;
        int sum = 0;
        System.out.println(sumofDigit(A, sum));

    }

    public static int sumofDigit(int A,int sum) {
        if(A==0) return sum;
        sum += A%10;
        return sumofDigit(A/10, sum);        
    }
}
