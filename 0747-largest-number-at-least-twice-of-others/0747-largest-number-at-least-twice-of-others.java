class Solution {
    public int dominantIndex(int[] nums) {
        int idx = -1;
        int max = 0;
        
        for (int n : nums) {
            max = Math.max(max, n);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                idx = i;
            } else {
                if (max < nums[i] * 2) {
                    return -1;
                }
            }
        }
        
        return idx;
    }
}