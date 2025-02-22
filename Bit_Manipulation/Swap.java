package Bit_Manipulation;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Before Swapping: a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping: a = " + a + " b = " + b);
        //char[] arr = ten.toCharArray();
        // for(int i = arr.length-1 ; i>=0 ; i--){
        //     if(arr[i] == '1'){
        //         arr[i] = '0';
        //    System.out.println("After Swapping: a = " + a + " b = " + b);
        // String ten = Integer.toBinaryString(10);
        //   }else{
        //         arr[i] = '1';
        //     }
        // }
        // System.out.println(arr);
    }
}
