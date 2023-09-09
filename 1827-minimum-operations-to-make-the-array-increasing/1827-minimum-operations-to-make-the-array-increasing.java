class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        int num = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] <= num) {
                res += num - nums[i] + 1;
                num++;
            } else {
                num = nums[i];
            }
        }
        return res;
    }
}