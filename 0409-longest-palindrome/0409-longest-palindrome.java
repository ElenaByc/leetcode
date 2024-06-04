class Solution {
    public int longestPalindrome(String s) {
        int[] low = new int[26];
        int[] upp = new int[26];
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                low[ch - 'a']++;
            } else {
                upp[ch - 'A']++;
            }
        }
        boolean odd = false;
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (low[i] >= 2) {
                cnt += low[i] / 2;
            }
            if (low[i] % 2 == 1) {
                odd = true;
            }
            if (upp[i] >= 2) {
                cnt += upp[i] / 2;
            }
            if (upp[i] % 2 == 1) {
                odd = true;
            }
        }
        
        return 2 * cnt + (odd ? 1 : 0);
    }
}