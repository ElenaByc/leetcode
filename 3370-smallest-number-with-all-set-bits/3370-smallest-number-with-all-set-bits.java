class Solution {
    public int smallestNumber(int n) {
        int ans = 0;
        int mul = 1;
        while (n > 0) {
            n /= 2;
            ans += mul;
            mul *= 2;
        }
        
        return ans;
    }
}