class Solution {
    public int countSubarrays(int[] nums) {
        int sum;
        int cnt = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            sum = nums[i] + nums[i + 2];
            if (nums[i + 1] % 2 == 0 && sum == nums[i + 1] / 2) {
                cnt++;
            }
        }

        return cnt;
    }
}