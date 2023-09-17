/**
 * @param {character[][]} board
 * @return {void} Do not return anything, modify board in-place instead.
 */
const solveSudoku =(board) => {
    if (!board || board.length == 0) {
        return;
    }
    result(board);
};

const result = (board) => {
    for (let i = 0; i < 9; i++) {
        for (let j = 0; j < 9; j++) {
            if (board[i][j] === ".") {
                for (let c = 1; c <= 9; c++) {
                    if (isValid(board, i, j, c.toString())) {
                        board[i][j] = c.toString();
                        if (result(board)) {
                            return true;
                        }else{
                            board[i][j] = ".";
                        }
                    }
                }
                return false;
            }
        }
    }
    return true;
};

const isValid = (board, row, col, num) => {
    for(let i = 0; i < 9; i++) {
        if (board[i][col] === num) {
          return false; //check column
        }
        if (board[row][i] === num) {
            return false; //check row
        }
    }
    //check 3*3 block
    //define 3*3 block
    row = Math.floor(row / 3) * 3 + 1;
    col = Math.floor(col / 3) * 3 + 1;
    for (let i = -1; i <= 1; i++) {
        for (let j = -1; j <= 1; j++) {
            if (board[row + i][col + j] === num) {
                return false;
            }
        }
    }
    
  return true;
};