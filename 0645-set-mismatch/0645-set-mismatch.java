class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int dup = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (!set.add(nums[i])) {
               dup = nums[i];
            } else {
                sum += nums[i];
            }
        }
        return new int[] {dup, (1 + n) * n / 2 - sum};
    }
}