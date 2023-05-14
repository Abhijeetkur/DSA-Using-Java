package com.abhi.backtracking;

public class SudokuSolverCharInput {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }
    static boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == '.'){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            // if you found some empty element in row, then break
            if (!emptyLeft){
                break;
            }
        }

        if (emptyLeft){
            return true;
            //sudoku solved
        }

        //backTrack

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)){
                board[row][col] = (char)(number + '0');
                if (solve(board)){
                    //found answer
                    return true;
                }else {
                    // backTrack
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    static boolean isSafe(char[][] board, int row, int col, int num){
        //check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[i][col] == (char)(num + '0')){
                return false;
            }
        }

        for (int j = 0; j < board.length; j++) {
            // check if the number is in the row
            if (board[row][j] == (char)(num + '0')){
                return false;
            }
        }

        // check in the grid of 3X3 matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int rStart = row - (row % sqrt);
        int cStart = col - (col % sqrt);

        for (int r = rStart; r < rStart + sqrt; r++){
            for (int c = cStart; c < cStart + sqrt; c++){
                if (board[r][c] == (char)(num + '0')){
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(char[][] board) {
        for(char[] row : board) {
            for(char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
