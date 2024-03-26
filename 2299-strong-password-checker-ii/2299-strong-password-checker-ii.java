class Solution {
    public boolean strongPasswordCheckerII(String p) {
        int n = p.length();
        if (n < 8) {
            return false;
        }
        
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;
        
        char ch = p.charAt(0);
        
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                if (p.charAt(i) == ch) {
                    return false;
                }
            }
            ch = p.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lower = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                upper = true;
            } else if (ch >= '0' && ch <= '9') {
                digit = true;
            } else if (ch == '!' || ch == '@' ) {
                special = true;
            } else if (ch == '#' || ch == '$' || ch == '%') {
                special = true;
            } else if (ch == '^' || ch == '&' || ch == '*' ) {
                special = true;
            } else if (ch == '(' || ch == ')' || ch == '-' || ch == '+' ) {
                special = true;
            }
            
        }
        
        return lower&&upper&&digit&&special;
    }
}