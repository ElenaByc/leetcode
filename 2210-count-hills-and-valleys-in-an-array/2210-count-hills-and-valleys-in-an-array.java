class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return 0;
        }
        int cnt = 0;
        int left, right;
        for (int i = 1; i < n - 1; i++) {
            left = i - 1;
            while(left >= 0 && nums[left] == nums[i]) {
                left--;
            }
            if (left < 0) {
                continue;
            }
            right = i + 1;
            while(right < n && nums[right] == nums[i]) {
                right++;
            }
            if (right == n) {
                continue;
            }
            if (nums[left] < nums[i] && nums[right] < nums[i]) {
                // hill
                // System.out.println("Hill: " + i);
                cnt++;
                i = right - 1;
                
            } else if (nums[left] > nums[i] && nums[right] > nums[i]) {
                // valley
                // System.out.println("Valley: " + i);
                cnt++;
                i = right - 1;
            }
            
        }
        
        return cnt;
    }
}