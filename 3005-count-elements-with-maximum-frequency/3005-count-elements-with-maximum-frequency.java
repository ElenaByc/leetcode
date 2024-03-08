class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int max = 0;
        int total = 0;
        
        for (int num : nums) {
            arr[num]++;
        }
        
        for (int i = 1; i < 101; i++) {
            if (arr[i] > max) {
                max = arr[i];
                total = arr[i];
            } else if (arr[i] == max) {
                total += arr[i];
            }
        }
        
        return  total;
    }
}