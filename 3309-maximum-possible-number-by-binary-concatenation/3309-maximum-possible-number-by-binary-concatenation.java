class Solution {
    public int maxGoodNumber(int[] nums) {
        String b0 = Integer.toBinaryString(nums[0]);
        String b1 = Integer.toBinaryString(nums[1]);
        String b2 = Integer.toBinaryString(nums[2]);
        
        int max = 0;
        max = Math.max(max, Integer.parseInt(b0+b1+b2, 2));
        max = Math.max(max, Integer.parseInt(b0+b2+b1, 2));
                       
        max = Math.max(max, Integer.parseInt(b1+b0+b2, 2));
        max = Math.max(max, Integer.parseInt(b1+b2+b0, 2));
        
        max = Math.max(max, Integer.parseInt(b2+b0+b1, 2));
        max = Math.max(max, Integer.parseInt(b2+b1+b0, 2));                      
        
        return max;
    }
}