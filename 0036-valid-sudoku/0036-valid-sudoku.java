class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        char ch;
        
        //Each row must contain the digits 1-9 without repetition.
        for(char[] row : board) {
            set.clear();
            for (int i = 0; i < 9; i++) {
                ch = row[i];
                if (ch != '.' && set.contains(ch)) {
                    return false;
                }
                if (ch != '.') {
                    set.add(ch);
                }
            }
        }
        
        // Each column must contain the digits 1-9 without repetition.
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                ch = board[j][i];
                if (ch != '.' && set.contains(ch)) {
                    return false;
                }
                if (ch != '.') {
                    set.add(ch);
                }
            }
        }
        
        //Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
        for (int i = 1; i < 9; i += 3) {
            for (int j = 1; j < 9; j += 3) {
                set.clear();
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        ch = board[i+k][j+l];
                        if (ch != '.' && set.contains(ch)) {
                            return false;
                        }
                        if (ch != '.') {
                            set.add(ch);
                        }
                    }
                }
            }   
        }
            
        
        return true;
        
    }
}