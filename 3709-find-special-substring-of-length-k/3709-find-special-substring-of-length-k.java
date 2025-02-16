class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        char curr = s.charAt(0), ch;
        int cnt = 1;
        
        int i = 1;
        while (i < n) {
            ch = s.charAt(i);
            if (ch == curr) {
                cnt++;
            } else {
                if (cnt == k) {
                    return true;
                }
                curr = ch;
                cnt = 1;
            }
            i++;
        }
        
        return cnt == k;
    }
}