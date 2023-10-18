class Solution {
    public int maximumCount(int[] nums) {
        int max = 0;
        int i = 0;
        while (i < nums.length && nums[i] < 0) {
            i++;
        }
        max = i;
        while (i < nums.length && nums[i] == 0) {
            i++;
        }
        max = Math.max(max, nums.length - i);
        return max;
    }
}