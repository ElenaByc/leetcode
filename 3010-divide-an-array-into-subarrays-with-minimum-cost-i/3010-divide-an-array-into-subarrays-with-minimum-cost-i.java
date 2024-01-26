class Solution {
    public int minimumCost(int[] nums) {
        int cost1 = nums[0];
        int cost2 = 51;
        int cost3 = 51;
        int index2 = 0;
        int index3 = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < cost2) {
                cost3 = cost2;
                index3 = index2;
                cost2 = nums[i];
                index2 = i;
            } else if (nums[i] == cost2) {
                cost3 = nums[i];
                index3 = i;
            } else if (nums[i] < cost3) {
                cost3 = nums[i];
                index3 = i;
            }
        }
        
        return cost1 + cost2 + cost3;
    }
}