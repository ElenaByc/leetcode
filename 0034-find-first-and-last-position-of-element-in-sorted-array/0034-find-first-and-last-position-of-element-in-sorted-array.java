class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int idx1 = findLowBound(nums, low, high, target);
        if (idx1 < nums.length && nums[idx1] == target) {
            int idx2 = findLowBound(nums, idx1, high, target + 1) - 1;
            return new int[] {idx1, idx2};
        }
        return new int[]{-1, -1};
    }
    
    public int findLowBound(int[] nums, int low, int high, int target) {
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // System.out.println(low);
        return low;
    }
}