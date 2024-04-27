class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = 0;
        int len = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                maxLen = Math.max(maxLen, len);
                len = 1;
            }
        }
        
        return Math.max(maxLen, len);
    }
}