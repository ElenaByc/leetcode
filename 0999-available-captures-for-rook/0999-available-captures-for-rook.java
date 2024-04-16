class Solution {
    public int numRookCaptures(char[][] b) {
        int cnt = 0;
        
        // find R
        int x = -1, y = -1;
        int i = 0;
        int j = 0;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                if (b[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
            if (x >= 0) {
                break;
            }
        }
        // System.out.println("x = " + x + " y = " + y);
        i = x + 1;
        j = y + 1;
        
        while (i < 8 && b[i][y] == '.') {
            i++;
        }
        if (i < 8 && b[i][y] == 'p') {
            cnt++;
        }
        
        
        while (j < 8 && b[x][j] == '.') {
            j++;
        }
        if (j < 8 && b[x][j] == 'p') {
            cnt++;
        }
        
        i = x - 1;
        j = y - 1;
        
        while (i >= 0 && b[i][y] == '.') {
            i--;
        }
        if (i >= 0 && b[i][y] == 'p') {
            cnt++;
        }
        
        while (j >= 0 && b[x][j] == '.') {
            j--;
        }
        if (j >= 0 && b[x][j] == 'p') {
            cnt++;
        }
        
        
        return cnt;
    }
}