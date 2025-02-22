package Bit_Manipulation;

public class XORformOtoA {
    public static void main(String[] args) {
        int a = 26;
        switch(a % 4) {
            case 0:
                System.out.println(a);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(a + 1);
                break;
            case 3:
                System.out.println(0);
                break;
        }
       
    }
}
