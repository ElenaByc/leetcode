class Solution {
    public int findLucky(int[] arr) {
        int[] nums = new int[501];
        int largest = -1;
        
        for (int num : arr) {
            nums[num]++;
        }
        
        
        for (int i = 1; i <= 500; i++) {
            if (i == nums[i] && i > largest) {
                largest = i;
            }
        }
        
        return largest;
    }
}