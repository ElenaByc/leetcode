class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digits = 0;
        
        for (int n : nums) {
            sum += n;
            while (n > 0) {
                digits += n % 10;
                n /= 10;
            }
        }
        
        return Math.abs(sum - digits);
    }
}