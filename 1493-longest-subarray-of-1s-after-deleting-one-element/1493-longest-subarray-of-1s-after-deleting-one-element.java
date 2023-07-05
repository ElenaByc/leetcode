class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0; // left pointer
        int r = 0; // right pointer
        int zeroCounter = 0; // no more than 1 zero allowed
        int maxLen = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                zeroCounter++;
            }
            while (zeroCounter > 1) {
                // move left pointer
                if (nums[l] == 0) {
                    zeroCounter--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, r - l);
            r++;
        }
        return maxLen;
    }
}