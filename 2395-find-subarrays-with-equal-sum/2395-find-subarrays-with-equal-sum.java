class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int sum;
        
        for (int i = 0; i < n - 1; i++) {
            sum = nums[i] + nums[i + 1];
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        
        return false;
    }
}