package Recursion;

public class CountNoofZeros {
    public static void main(String[] args) {
        System.out.println(CountZeros(129000100, 0));
    }

    static int CountZeros(int A , int count){
        if(A <= 0) return count;
        int rem = A%10;
        if(rem == 0){
            count++;
        }

        return CountZeros(A/10, count);
    }
}
