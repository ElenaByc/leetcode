class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) return 0;
        
        int min = 100001;
        
        Arrays.sort(nums);
        for (int i = 0; i < n - k + 1; i++) {
            min = Math.min(min, nums[i + k - 1] - nums[i]);
        }
        
        return min;
    }
}