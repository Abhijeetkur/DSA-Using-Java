package com.abhi.backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        int count = countWays(n);
        System.out.println("The number of ways to place " + n + " knights on an " + n + " x " + n + " chessboard without attacking each other is " + count);
    }

    // Recursive function to count the number of ways to place knights on the board
    public static int countWays(int n) {
        // Initialize the board with zeros
        int[][] board = new int[n][n];
        // Call the recursive function to count the number of ways
        return countWaysHelper(board, 0, 0, 7);
    }

    // Recursive function to count the number of ways to place knights on the board
    private static int countWaysHelper(int[][] board, int row, int col, int knights) {
        // Base case: if all knights are placed, return 1
        if (knights == 0) {
            return 1;
        }
        // Initialize the count to 0
        int count = 0;
        // Try to place a knight on each square of the board
        for (int i = row; i < board.length; i++) {
            for (int j = col; j < board.length; j++) {
                // Check if the square is safe to place a knight
                if (isSafe(board, i, j)) {
                    // Place a knight on the square
                    board[i][j] = 1;
                    // Recursively call the function to place the remaining knights
                    count += countWaysHelper(board, i, j + 1, knights - 1);
                    // Remove the knight from the square
                    board[i][j] = 0;
                }
            }
            // Reset the column index after trying all squares in the current row
            col = 0;
        }
        // Return the total count
        return count;
    }

    // Function to check if the square is safe to place a knight
    private static boolean isSafe(int[][] board, int row, int col) {
        // Check if the square is inside the board
        if (row < 0 || row >= board.length || col < 0 || col >= board.length) {
            return false;
        }
        // Check if the square is not attacked by any of the previously placed knights
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1 && (i - row) * (i - row) + (j - col) * (j - col) == 5) {
                    return false;
                }
            }
        }
        // If the square is safe, return true
        return true;
    }

}
