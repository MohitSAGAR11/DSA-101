package Bit_Manipulation;

public class XORfromAtoB {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(xorFromAtoB(a, b));
    }

    public static int xorFromAtoB(int a, int b) {
        return xorFrom0toA(a-1) ^ xorFrom0toA(b);
    }

    public static int xorFrom0toA(int a) {
        if(a % 4 == 0){
            return a;
        }else if(a % 4 == 1){
            return 1;
        }else if(a % 4 == 2){
            return a + 1;
        }else{
            return 0;
        }
    }
}
