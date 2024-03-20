class Solution {
    public int minimumMoves(String s) {
        int n = s.length();
        int moves = 0;
        
        int l = 0;
        int r = n - 1;
        
        while (l < n && s.charAt(l) == 'O') {
            l++;
        }
        // System.out.println("l = " + l);
        if (l == n) {
            return 0;
        }
        
        while (r > l && s.charAt(r) == 'O') {
            r--;
        }
        // System.out.println("r = " + r);

        while (l <= r) {
            moves++;
            l += 3;
            while (l < n && s.charAt(l) == 'O') {
                l++;
            }
        }
        
        return moves;
    }
}