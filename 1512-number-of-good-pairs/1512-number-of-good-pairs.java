class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        int[] arr = new int [101];
        
        for (int num : nums) {
            arr[num]++;
        }
        
        for (int i = 1; i <= 100; i++) {
            if (arr[i] > 1) {
                result += arr[i] * (arr[i] - 1) / 2;
            } 
        }
        
        
        return result;
    }
}