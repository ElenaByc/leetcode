class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        if (l < 2) return false;
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                if (s.equals((s.substring(0, i)).repeat(l / i))) {
                    return true;
                }
            }
        }
        return false;
    }
}