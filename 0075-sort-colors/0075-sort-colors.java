class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0;               // 0 pointer 
        int p = 0;                //  pointer 
        int p2 = nums.length - 1; // 2 pointer 
        while (p <= p2) {
           if (nums[p] == 0) {
               nums[p] = nums[p0];
               p++;
               nums[p0] = 0;
               p0++;
           } else if(nums[p] == 1) {
               p++;
           } else { // nums[p] == 2
               nums[p] = nums[p2];
               nums[p2] = 2;
               p2--;
           }
       } 
    }
}