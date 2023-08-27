class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int num;
        int j = 0;
        int subsetSum = 0;
        for (int i = 0; i < Math. pow(2, n); i++) {
            num = i;
            subsetSum = 0;
            j = 0;
            while (num > 0) {
                if (num % 2 != 0) {
                    subsetSum ^= nums[j]; 
                }
                num /= 2;
                j++;
            }
            sum += subsetSum;
        }
        return sum;
    }
}