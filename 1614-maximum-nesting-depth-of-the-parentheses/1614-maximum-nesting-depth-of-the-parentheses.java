class Solution {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                currentDepth++;
            } else if (ch == ')') {
                maxDepth = Math.max(currentDepth, maxDepth);
                currentDepth--;
            }
        }
        return maxDepth;
    }
}