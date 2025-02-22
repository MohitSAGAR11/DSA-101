package Recursion;

public class ProductOFdigits {
    public static void main(String[] args) {
        System.out.println(POD(1991,1));
    }

    public static int POD(int A,int prod){
        if(A==0) return prod;

        prod *= A%10;
        return POD(A/10 , prod);
    }
}
