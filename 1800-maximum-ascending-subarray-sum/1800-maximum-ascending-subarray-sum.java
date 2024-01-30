class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int sum = nums[0];
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > num) {
                sum += nums[i];
            } else {
                maxSum = Math.max(sum, maxSum);
                sum = nums[i];
            }
             num = nums[i];
        }
        maxSum = Math.max(sum, maxSum);
        return maxSum;
    }
}