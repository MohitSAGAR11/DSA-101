package Recursion;

class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int A){
        if(A <= 1){
            return 1;
        }
        return A*fact(A-1);
    }
}
