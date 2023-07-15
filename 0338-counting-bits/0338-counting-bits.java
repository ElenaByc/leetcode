class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i <= n ; i++) {
            result[i] = hammingWeight(i);
        } 
        return result;
    }
    
        
        
    private int hammingWeight(int n) {
        int ans = 0;
        while (n > 0) {
            n &= (n - 1);
            ans++;
        }
        return ans;
    }
}