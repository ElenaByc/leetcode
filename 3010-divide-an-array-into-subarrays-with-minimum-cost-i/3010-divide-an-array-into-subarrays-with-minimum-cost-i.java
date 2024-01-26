class Solution {
    public int minimumCost(int[] nums) {
        int cost1 = nums[0];
        int cost2 = 51;
        int cost3 = 51;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < cost2) {
                cost3 = cost2;
                cost2 = nums[i];
            } else if (nums[i] == cost2) {
                cost3 = nums[i];
            } else if (nums[i] < cost3) {
                cost3 = nums[i];
            }
        }
        
        return cost1 + cost2 + cost3;
    }
}