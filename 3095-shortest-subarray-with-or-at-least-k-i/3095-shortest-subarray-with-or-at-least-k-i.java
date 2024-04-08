class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int sum;
        for (int len = 1; len <= n; len++) {
            // System.out.println("len = " + len);
            for (int i = 0; i < n - len + 1; i++) {
                sum = nums[i];
                for (int j = 1; j < len; j++) {
                    sum |= nums[i + j];
                }
                // System.out.println(sum);
                if (sum >= k) {
                    return len;
                }
            }
        }
        
        return -1;
    }
}