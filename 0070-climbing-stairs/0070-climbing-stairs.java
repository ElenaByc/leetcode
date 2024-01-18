class Solution {
    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }
        int prev = 1;
        int curr = 2;
        for(int i = 3; i <= n; i++) {
            curr += prev;
            prev = curr - prev;
        }
        return curr;
    }
}