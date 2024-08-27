class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int n = nums.length;
        int minIdx = 0;
        int min = nums[0];
        
        for (int i = 0; i < k; i++) {
            // find min and minIdx
            minIdx = 0;
            min = nums[0];
            for (int j = 0; j < n; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIdx = j;
                }
            }
            // multiply
            nums[minIdx] *= m;
        }
        
        return nums;
    }
}