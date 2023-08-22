class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                if (findWord(board, i, j, word, 0)) {
                    return true;
                }
            }
        return false;
    }

    public static boolean findWord(char[][] board, int i, int j, String word, int ind) {
        if (ind == word.length()) {
            return true;
        }
        if (i > board.length - 1 || i < 0 || j < 0 || j > board[0].length - 1
                || board[i][j] != word.charAt(ind)) {
            return false;
        }
        board[i][j] = '*';
        boolean result = findWord(board, i - 1, j, word, ind + 1) ||
                findWord(board, i, j - 1, word, ind + 1) ||
                findWord(board, i, j + 1, word, ind + 1) ||
                findWord(board, i + 1, j, word, ind + 1);
        board[i][j] = word.charAt(ind); //restore board
        return result;
    }
}