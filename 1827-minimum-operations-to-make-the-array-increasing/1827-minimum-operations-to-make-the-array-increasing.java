class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 1) return 0;
        int res = 0;
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
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