class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] result = new int[n][m];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                counter = 0;
                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        if ((i + k >= 0 && i + k < n) && (j + l >= 0 && j + l < m)) {
                            counter += board[i + k][j + l];
                        }
                    }
                }

                if (board[i][j] == 0) {
                    if (counter == 3) { // Any dead cell with exactly three live neighbors becomes a live cell
                        result[i][j] = 1;
                    } else {
                        result[i][j] = 0;
                    }
                } else {
                    counter--;
                    if (counter < 2) { // Any live cell with fewer than two live neighbors dies
                        result[i][j] = 0;
                    } else if (counter < 4) { // Any live cell with two or three live neighbors lives 
                        result[i][j] = 1;
                    } else {
                        result[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = result[i][j];
            }
        }
    }
}