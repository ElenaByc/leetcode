class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;
        int diff;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                diff = Math.abs(nums[i] - nums[n - 1]);
            } else {
                diff = Math.abs(nums[i] - nums[i - 1]);
            }
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}