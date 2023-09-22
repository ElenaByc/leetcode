class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = 0;
        int i;
        for (i = 0; i < s.length() && p < t.length(); i++) {
            while(p < t.length() && s.charAt(i) != t.charAt(p)) {
                p++;
            }
            if (p == t.length() || s.charAt(i) != t.charAt(p)) {
                return false;
            }
            // System.out.println(s.charAt(i) + " found at position " + p);
            p++;
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }
}