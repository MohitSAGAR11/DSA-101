package Bit_Manipulation;

public class Power {
    public static void main(String[] args) {
        int n = 2;
        int p = 3;
        System.out.println(power(n, p));
    }

    public static int power(int n, int p) {
        int ans = 0;
        while(p > 0){
            int last = p & 1;
            p = p >> 1;
            if(last == 1){
                ans += n;
            }
            n *= n;
        }
        return ans;
    }
}
