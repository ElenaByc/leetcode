class Solution {
    public String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0) {
               // X
                board[moves[i][0]][moves[i][1]] = 1;
            } else {
                // O
                board[moves[i][0]][moves[i][1]] = 2;
            }
        }
        
        // check every row 
        for (int[] row : board) {
            if (row[0] == row[1] && row[1] == row[2]) {
                if (row[0] == 1) {
                    return "A";
                } else if (row[0] == 2) {
                    return "B";
                }
            }
        }
        // check every column
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] == 1) {
                    return "A";
                } else if (board[0][i] == 2) {
                    return "B";
                }
            }
        }
        
        // check main diagonal
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 1) {
                return "A";
            } else if (board[0][0] == 2) {
                return "B";
            }
        }
        
        // check second diagonal
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            if (board[2][0] == 1) {
                return "A";
            } else if (board[2][0] == 2) {
                return "B";
            }
        }
        
        if (moves.length == 9) {
            return "Draw";
        }
        
        return "Pending";
    }
}