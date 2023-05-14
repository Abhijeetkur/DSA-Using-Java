package com.abhi.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == 0){
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
                board[row][col] = number;
                if (solve(board)){
                    //found answer
                    return true;
                }else {
                    // backTrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        //check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[i][col] == num){
                return false;
            }
        }

        for (int j = 0; j < board.length; j++) {
            // check if the number is in the row
            if (board[row][j] == num){
                return false;
            }
        }

        // check in the grid of 3X3 matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int rStart = row - (row % sqrt);
        int cStart = col - (col % sqrt);

        for (int r = rStart; r < rStart + sqrt; r++){
            for (int c = cStart; c < cStart + sqrt; c++){
                if (board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
