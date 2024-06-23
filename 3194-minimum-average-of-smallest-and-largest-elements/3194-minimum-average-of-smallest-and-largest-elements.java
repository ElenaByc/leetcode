class Solution {
    public double minimumAverage(int[] nums) {
        double min = 51;
        
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < n / 2; i++) {
            double avg = (nums[i] + nums[n - 1 - i]) / 2.0;
            min = Math.min(min, avg);
        } 
        
        return min;
    }
}