package Recursion;

public class ReverseAnumber {
    static int sum = 0;
    static void rev(int N){
       
        if(N == 0) return;

        int rem = N%10;
        sum = sum*10 + rem;
        rev(N/10);
    }

    static int rev2(int N){
        //sometimes you need additional variables in the argument 
        //in that case make another function
        int digits = (int)(Math.log10(N)) + 1;
        return helper(N,digits);
    }

    static int helper(int N,int digits){
        if(digits == 1){
            return N;
        }
        int rem = N%10;
        return (int)(rem * Math.pow(10,digits-1)) + helper(N/10,digits-1);
    }

    public static void main(String[] args) {
        //it is int not string;
        int reverse = rev2(1234);
        System.out.println(reverse);
    }

    
}
