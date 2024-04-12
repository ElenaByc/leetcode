class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        int max = 0;
        int len;
        
        for (int n : nums) {
            max = 0;
            len = 0;
            while (n > 0) {
                len++;
                max = Math.max(max, n % 10);
                n /= 10;
            }
            sum += Integer.parseInt((Integer.toString(max)).repeat(len));
        }
        
        return sum;
    }
}