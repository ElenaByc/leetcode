class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int currentSum = 0;
        int currentLen = 0;
        int minLen = nums.length + 1;
        
        while (r < nums.length) {
            currentSum += nums[r];
            r++;

            if (currentSum >= target) {
                // try to move left pointer
                while (currentSum >= target) {
                    currentSum -= nums[l];
                    l ++;
                }
                currentLen = r - l + 1;
                minLen = Math.min(minLen, currentLen);
            }
        }
            
        
        return (minLen == nums.length + 1) ? 0 : minLen;
    }
}