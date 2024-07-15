class Solution {
    public String getSmallestString(String s) {
        int n = s.length();
        int curr;
        int prev = s.charAt(0) - '0';
        
        for (int i = 1; i < n; i++) {
            curr = s.charAt(i) - '0';
            if (curr < prev && curr % 2 == prev % 2) {
                if (i == 1) {
                    if (i < n - 1) {
                        return "" + s.charAt(i) + s.charAt(i - 1) + s.substring(i + 1);
                    }
                    return "" + s.charAt(i) + s.charAt(i - 1);
                }
                if (i < n - 1) {
                    return s.substring(0, i - 1) + s.charAt(i) + s.charAt(i - 1) + s.substring(i + 1);
                }
                return s.substring(0, i - 1) + s.charAt(i) + s.charAt(i - 1);
            }
            prev = curr;
        }
        
        return s;
    }
}