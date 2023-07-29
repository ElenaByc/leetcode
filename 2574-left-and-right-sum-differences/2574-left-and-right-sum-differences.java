class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] leftSums = new int[n];
        int[] rightSums = new int[n];
        leftSums[0] = 0;
        rightSums[n - 1] = 0;
        
        for (int i = 0; i < n - 1; i++) {
            leftSums[i + 1] = leftSums[i] + nums[i];
        }
        
        for (int i = n - 1; i > 0; i--) {
            rightSums[i - 1] = rightSums[i] + nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(leftSums[i] - rightSums[i]);
        }
        
        return result;
    }
}