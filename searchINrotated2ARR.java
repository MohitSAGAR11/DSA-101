class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[s] == nums[mid] && nums[e] == nums[mid]) {
                s = s + 1;
                e = e - 1;
                continue;
            }
            if (nums[s] <= nums[mid]) {
                if (nums[s] <= target && target <= nums[mid]) {
                    // element exists:
                    e = mid - 1;
                } else {
                    // element does not exist:
                    s = mid + 1;
                }
            } else { // if right part is sorted:
                if (nums[mid] <= target && target <= nums[e]) {
                    // element exists:
                    s = mid + 1;
                } else {
                    // element does not exist:
                    e = mid - 1;
                }
            }
        }
        return false;
    }

}
