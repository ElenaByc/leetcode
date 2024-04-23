class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] arr = new int[100001];
        int max = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                arr[n]++;
                max =  Math.max(max, arr[n]);
            }
        }
        
        if (max == 0) return -1;
        
        for (int i = 0; i < arr.length; i+= 2) {
            if (arr[i] == max) {
                return i;
            }
        }
        
        return 0;
    }
}