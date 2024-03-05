class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int n = str.length();
        int d;
        if (k == n) {
            return 1;
        }
        int cnt = 0;
        for (int i = 0; i < n - k + 1; i++) {
            d = Integer.valueOf(str.substring(i, i + k));
            if (d != 0 && num % d == 0) {
                cnt++;
            }
        }
        
        
        return cnt;
    }
}