class Solution {
    public void solveSudoku(char[][] board) {
         solve(board);
    }
    
    public boolean solve(char[][] board){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') { // empty space
                    for(char c = '1'; c <= '9'; c++) { //trial. Try 1 through 9
                        if(isValid(board, i, j, c)){
                            board[i][j] = c; //Put c for this cell
                            
                            if(solve(board)) {
                                return true; //If it's the solution return true
                            } else {
                                board[i][j] = '.'; //Otherwise go back
                            }
                        }
                    }
                    return false; // tried all numbers from 1 to 9
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] board, int row, int col, char c){
        for(int i = 0; i < 9; i++) {
            if (board[i][col] == c) {
                return false; //check column
            }
            if (board[row][i] == c) {
                return false; //check row
            }
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                return false; //check 3*3 block
            }
        }
        return true;
    }
}
