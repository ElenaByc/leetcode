class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long currSum;
        long maxSum = 0;
        int n = nums.length;
        
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        
        currSum = maxSum;
        
        for (int i = k; i < n; i++) {
            currSum -= nums[i - k];
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        
        return (double)(maxSum * 1.0 / k);
    }
}