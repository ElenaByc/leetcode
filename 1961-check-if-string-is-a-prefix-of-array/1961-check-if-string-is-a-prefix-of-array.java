class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int l = 0; 
        int r = l;
        int n = s.length();
        
        for (String w  : words) {
            r = l + w.length();
            if (r > n) {
                return false;
            }
            if (s.substring(l, r).equals(w)) {
                if (r == n) {
                    return true;
                }
                l = r;
            } else {
                return false;
            }
        }
        
        return false;
    }
}