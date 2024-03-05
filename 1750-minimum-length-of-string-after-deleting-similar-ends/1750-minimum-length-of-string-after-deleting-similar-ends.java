class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        if (n == 1) {
            return 1;
        }
        int l = 0;
        int r = n - 1;
        char ch;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            ch = s.charAt(l);
            while (l < r && s.charAt(l) == ch) {
                l++;
            }
            if (l == r) {
                return 0;
            }
            while (r > l && s.charAt(r) == ch) {
                r--;
            }
        }
        
        return r - l + 1;
    }
}