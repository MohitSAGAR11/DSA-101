package Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int[] A  = {1, 2, 3};
        List<List<Integer>> ans = subsets(A);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsett = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();
        for (int num = 0; num < subsett; num++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
