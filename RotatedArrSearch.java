class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int peak = peakIdx(nums);
        while(s<e){
            int mid = s + (e-s)/2;
            int realmid = (mid+peak)%nums.length;
            if(nums[realmid] == target){
                return realmid;
            } else if(nums[realmid] < target){
                s = mid + 1;
            } else {
                e = mid;
            }           
        }
        return nums[s] == target ? s : -1;
    }

    public int peakIdx(int[] A){
        int s = 0;
        int e = A.length-1;
        while(s<e){
            int mid = s + (e-s)/2;
            if(A[mid] > A[mid+1]){
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}