package Bit_Manipulation;

public class checkIFpowerOF2 {
    public static void main(String[] args) {
        int n = 2048;
       
        if((n & (n-1)) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

