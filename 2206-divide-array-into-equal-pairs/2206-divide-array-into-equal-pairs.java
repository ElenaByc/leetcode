class Solution {
    public boolean divideArray(int[] nums) {
        int[] count = new int[500];
        
        for (int num : nums) {
            count[num - 1]++;
        }
        
        for (int i = 0; i < 500; i++) {
            if (count[i] % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}