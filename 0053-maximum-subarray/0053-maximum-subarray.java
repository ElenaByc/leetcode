class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int maxSum = nums[0];
        int sum = 0;
        
        int firstPositive = 0;
        
        while (firstPositive < n && nums[firstPositive] <= 0) {
            maxSum = Math.max(maxSum, nums[firstPositive]);
            firstPositive++;      
        }
        if (firstPositive == n) {
            return maxSum;
        }
        
        for (int i = firstPositive; i < n ; i++) {
            sum += nums[i];
  
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
        
    }
}