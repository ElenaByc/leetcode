class Solution {
    public String greatestLetter(String s) {
        boolean[] low = new boolean[26];
        boolean[] upper = new boolean[26];
        char ch;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                low[ch - 'a'] = true;
            } else {
                upper[ch - 'A'] = true;
            }
        }
        for (int i = 25; i >= 0; i--) {
            if (upper[i] && low[i]) {
                return "" + (char)('A' + i);
            }
        }
        
        return "";
    }
}