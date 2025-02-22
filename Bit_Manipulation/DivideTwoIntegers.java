package Bit_Manipulation;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
    }

    public static int divide(int dividend, int divisor) {
        int ans = 0;
        if(dividend == divisor) return 1;
        if(divisor == 1) return dividend;

        boolean sign = true;// +ve
        if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)){
            sign = false;
        }

        int n = Math.abs(dividend);
        int d = Math.abs(divisor);

        while(n >= d){
            int counter = 0;
            while(n >= Math.pow(2, counter+1) * d){  //(d << counter+1);
                counter++;
            }
            ans += Math.pow(2, counter);
            n -= Math.pow(2, counter) * d;
        }

        if(!sign) ans = -ans;
        return ans;
    }
}
