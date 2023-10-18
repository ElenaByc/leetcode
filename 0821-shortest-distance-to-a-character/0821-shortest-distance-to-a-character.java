class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        int leftDist, rightDist;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                answer[i] = 0;
            } else {
                leftDist = getLeftDist(s, i, c);
                rightDist = getRightDist(s, i, c);
                answer[i] = Math.min(leftDist, rightDist);
            }
        }
        
        return answer;
    }
    
    public int getLeftDist(String s, int pos, char c) {
        int n =  s.length();
        if (pos == 0) return n;
        int i = pos - 1;
        int dist = 1;
        
        while (i >= 0 && s.charAt(i) != c) {
            i--;
            dist++;
        }
        if (i < 0 && s.charAt(0) != c) {
            return n;
        }
        return dist;
    }

    public int getRightDist(String s, int pos, char c) {
        int n =  s.length();
        if (pos == n - 1) return n;
        int i = pos + 1;
        int dist = 1;
        while (i < n && s.charAt(i) != c) {
            i++;
            dist++;
        }
        if (i == n && s.charAt(n- 1) != c) {
            return n;
        }
        
        return dist;
    }
}