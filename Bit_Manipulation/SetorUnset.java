package Bit_Manipulation;

public class SetorUnset {
    public static void main(String[] args) {
        int n = 9;
        int i = 2;
        System.out.println(checkBit(n, i));
    }

    public static boolean checkBit(int n, int i){
        if((n & (1 << i)) != 0){
            return true;
        }else{
            return false;
        }
    }
}
