class Solution {
    public int unequalTriplets(int[] nums) {
        int ans = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] != nums[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums[k] != nums[j] && nums[k] != nums[i]) {
                            ans++;
                        }   
                    }
                }
            }
        }
        
        return ans;
    }
}