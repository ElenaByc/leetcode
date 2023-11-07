class Solution {
    public int similarPairs(String[] words) {
        int cnt = 0;
        int n = words.length;
        boolean[][] grid = new boolean[n][26];
        boolean equal;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                grid[i][words[i].charAt(j) - 'a'] = true;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                equal = true;
                for (int k = 0; k < 26; k++) {
                    if (grid[i][k] != grid[j][k]) {
                        equal = false;
                        break;
                    }
                }
                if (equal) {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}