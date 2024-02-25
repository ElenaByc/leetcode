class Solution {
    public int countElements(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        for (int num : nums) {
            if (num > min && num < max) {
                cnt++;
            }
        }
        
        return cnt;
    }
}