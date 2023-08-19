class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        if (l < 2) return false;
        String s2 = s.substring(1) + s.substring(0,l-1);
        return s2.contains(s);
    }
}