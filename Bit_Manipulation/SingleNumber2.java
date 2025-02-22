package Bit_Manipulation;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 3};
        System.out.println(threetimesExceptOne(arr));
    }

    // public static int threetimesExceptOne(int[] arr) {
    //    int ones = 0;
    //    int twos = 0;
    //    for(int i = 0 ; i<arr.length ; i++){
    //     ones = (ones ^ arr[i]) & (~twos);
    //     twos = (twos ^ arr[i]) & (~ones);
    //    }

    //     return ones;
    // }

    public static int threetimesExceptOne(int[] arr) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                result |= 1 << i;
            }
        }
        return result;
    }
}
