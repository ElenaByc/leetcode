class Solution {
    public int[] separateDigits(int[] nums) {
        // calculate result arrray length
        int len = 0;
        for (int num : nums) {
            len += Integer.toString(num).length();
        }
        
        int[] result = new int[len];
        int j = len - 1;
        int num;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            num = nums[i];
            while (num > 0) {
                result[j] = num % 10;
                j--;
                num /= 10;
            }
        } 
        
        return result;
    }
}