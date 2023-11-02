class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[n-1] - nums[0] == 0) return 0;
        if  (nums[n-1] - nums[0] <= 2 * k) return 0;
        return nums[n-1] - nums[0] - 2 * k;
    }
}