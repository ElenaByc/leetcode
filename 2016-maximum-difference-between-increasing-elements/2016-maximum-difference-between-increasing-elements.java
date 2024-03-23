class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int maxDif = -1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > min) {
                maxDif = Math.max(nums[i] - min, maxDif);
            } else {
                min = nums[i];
            }
        }
            
        return maxDif;
    }
}