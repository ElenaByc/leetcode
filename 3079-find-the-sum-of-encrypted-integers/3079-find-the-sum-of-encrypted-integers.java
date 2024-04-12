class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        int max = 0;
        int len;
        int mul;
        
        for (int n : nums) {
            max = 0;
            len = 0;
            mul = 1;
            while (n > 0) {
                len++;
                max = Math.max(max, n % 10);
                n /= 10;
            }
            while (len > 0) {
                sum += max * mul;
                len--;
                mul *= 10;
            }
        }
        
        return sum;
    }
}