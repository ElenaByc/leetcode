class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int longest = 0;
        int len;
        int cnt0 = 0; 
        int cnt1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (cnt1 == 0) {
                    cnt0++;
                } else {
                    longest = Math.max(longest, cnt1 * 2);
                    cnt0 = 1;
                    cnt1 = 0;
                }
            } else { // s.charAt(i) == '1'
                if (cnt0 == 0) {
                    continue;
                }
                cnt1++;
                if (cnt1 == cnt0) {
                    longest = Math.max(longest, cnt1 * 2);
                    cnt0 = 0;
                    cnt1 = 0;
                }
            }
        }
        if (cnt0 > 0 && cnt1 > 0) {
            longest = Math.max(longest, cnt1 * 2);
        }
        return longest;
    }
}