package Bit_Manipulation;

public class setTHEithbit {
    public static void main(String[] args) {
        int n = 10;
        int i = 3;
        setBIT(n, i);
    }

    public static void setBIT(int n,int i){
        n = n | (1 << i);
        System.out.println(n);
    }
}
