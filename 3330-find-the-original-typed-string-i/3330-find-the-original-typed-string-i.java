class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;
        int[] letters = new int[26];
        int cnt = 1;
        char ch = word.charAt(0);
        char ch2;
        
        for (int i = 1; i < word.length(); i++) {
            ch2 = word.charAt(i);
            if (ch == ch2) {
                cnt++;
            } else {
                ans += cnt - 1;
                ch = ch2;
                cnt = 1;
            }
        }
        ans += cnt - 1;
        
        return ans;
    }
}