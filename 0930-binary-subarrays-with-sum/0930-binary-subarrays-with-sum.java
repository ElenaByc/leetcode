class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums, goal) - helper(nums,goal-1);
    }
    public int helper(int[] nums, int goal) {
        int sum = 0;
        int cnt = 0;
        int n = nums.length;
        int start = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while(start <= i && sum > goal) {
                sum -= nums[start];
                start++;
            }
            cnt += i - start + 1;
        }
        
        return cnt; 
    }
}