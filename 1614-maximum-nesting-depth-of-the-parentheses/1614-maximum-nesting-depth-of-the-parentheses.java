class Solution {
    public int maxDepth(String s) {
        int d = 0;
        int n = s.length();
        char ch;
        int open = 0;
        
        if (n < 2) {
            return 0;
        }
        
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                d = Math.max(d, open);
                open--;
            }
        }
        
        return d;
    }
}