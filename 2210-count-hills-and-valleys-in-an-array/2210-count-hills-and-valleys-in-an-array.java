class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int left = nums[0];
        for(int i = 1; i < n - 1; i++) {
            if(left < nums[i] && nums[i] > nums[i + 1] || left > nums[i] && nums[i] < nums[i + 1]){
                cnt++;
                left = nums[i];
            }
        }
        return cnt;
    }
}