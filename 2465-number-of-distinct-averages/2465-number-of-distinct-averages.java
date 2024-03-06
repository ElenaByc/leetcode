class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        double average;
        for (int i = 0; i < n/2; i++) {
            average = (nums[i] + nums[n - 1 - i]) / 2.0;
            set.add(average);
        }
        
        return set.size();
    }
}