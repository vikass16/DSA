class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> solutions = queens(board, 0);
        System.out.println(solutions);
        return solutions;
    }

    static List<List<String>> queens(boolean[][] board, int row) {
        List<List<String>> result = new ArrayList<>();
        
        // Base case: If all queens are placed, construct the board representation
        if (row == board.length) {
            result.add(constructBoard(board));
            return result;
        }

        // Place the queen and check for every column
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                // Recursively get solutions from the next rows and add them to our result
                result.addAll(queens(board, row + 1));
                board[row][col] = false; // Backtrack
            }
        }
        return result;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    // Helper method to convert the boolean board state into a List of Strings
    private static List<String> constructBoard(boolean[][] board) {
        List<String> internal = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean element : row) {
                if (element) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            internal.add(sb.toString());
        }
        return internal;
    }
}