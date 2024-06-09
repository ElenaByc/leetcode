class Solution {
    public int maxTotalReward(int[] values) {
        Arrays.sort(values);
        int[] arr = new int[4000];
        
        for (int i = 0; i < 4000; i++) {
            arr[i] = i;
        }
        
        for (int i = 1999; i >= 0; i--) {
            for (int num : values) {
                if (num > i) {
                    arr[i] = Math.max(arr[i], arr[i + num]);
                }
            }
        }
        
        return arr[0];
    }
}