class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n  = nums.length;
        int[] result = new int[n];
        int j;
        
        for (int i = 0; i < n; i++) {
            j = (i + nums[i]) % n;
            if (j < 0) {
                j = -j;
                j %= n;
                j = n - j;
            }
            // while (j < 0) {
            //     j+= n;
            // }
            result[i] = nums[j];
        }
        
        return result;
    }
}