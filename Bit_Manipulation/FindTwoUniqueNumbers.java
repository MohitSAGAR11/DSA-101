package Bit_Manipulation;

public class FindTwoUniqueNumbers {
    public static int[] findUniqueNumbers(int[] nums) {
        int xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }

        int rightmostSetBit = xorAll & -xorAll; 
        int x = 0, y = 0;

        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                x ^= num; 
            } else {
                y ^= num; 
            }
        }

        return new int[]{x, y};
    }

   
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 6, 2, 10, 4};
        int[] result = findUniqueNumbers(nums);
        System.out.println("The two unique numbers are: " + result[0] + " and " + result[1]);
    }
}
