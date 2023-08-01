class Solution {
    public int missingNumber(int[] nums) {
        int maxNum = 0;
        int sum = 0;

        for (int n : nums) {
            if (n > maxNum) {
                maxNum = n;
            }
            sum += n;
        }
        
        int missing = (maxNum + 1) * maxNum / 2 - sum;
        if (missing == 0 && nums.length == maxNum + 1) {
            missing = maxNum + 1;
        }

        return missing;
    }
}