class Solution {
    public int smallestRangeI(int[] nums, int k) {
        // Arrays.sort(nums);
        int min = 10000;
        int max = 0;
        // int n = nums.length;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        if  (max - min <= 2 * k) return 0;
        return max - min - 2 * k;
    }
}