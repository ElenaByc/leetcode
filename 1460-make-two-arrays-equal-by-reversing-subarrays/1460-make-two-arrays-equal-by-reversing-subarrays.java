class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] cnt = new int[1001];
        int n = target.length;
        
        for (int i = 0; i < n; i++) {
            cnt[target[i]]++;
            cnt[arr[i]]--;
        }
        for (int i = 0; i < 1001; i++) {
            if (cnt[i] != 0) {
                return false;
            }
        }
        
        return true;
        
    }
}