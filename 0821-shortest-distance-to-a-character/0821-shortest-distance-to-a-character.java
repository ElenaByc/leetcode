class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        int prev, next;
        // Find the first occurrence of c
        next = findNext(s, c, 0);
        for (int i = next; i >= 0; i--) {
            answer[i] = next - i;
        }
        while (next < n) {
            prev = next;
            next = findNext(s, c, next + 1);
            for (int i = prev + 1; i <= next && i < n; i++) {
                answer[i] = Math.min (i - prev, next - i);
            }
        }
        
        return answer;
        
    }
    
    public int findNext(String s, char c, int startPos) {
        int next = startPos;
        int n = s.length();
        
        while (next < n && s.charAt(next) != c) {
            next++;
        }
        if (next == n && s.charAt(n - 1) != c) {
            return Integer.MAX_VALUE;
        }
        return next;
    }
}