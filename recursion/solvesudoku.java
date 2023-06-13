
public class solvesudoku {
    public static void main(String[] args) {
        String[][] input = {
                { "5", "3", ".", ".", "7", ".", ".", ".", "." },
                { "6", ".", ".", "1", "9", "5", ".", ".", "." },
                { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                { "8", ".", ".", ".", "6", ".", ".", ".", "3" },
                { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                { "7", ".", ".", ".", "2", ".", ".", ".", "6" },
                { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                { ".", ".", ".", "4", "1", "9", ".", ".", "5" },
                { ".", ".", ".", ".", "8", ".", ".", "7", "9" }
        };

        char[][] arr = new char[input.length][input[0].length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                arr[i][j] = input[i][j].charAt(0);
            }
        }
        solveSudoku(arr);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public static void solve(char[][] board, int r, int c) {
        if (r == board.length) {
            // Completed solving the Sudoku
            return;
        }

        if (c == board[0].length) {
            solve(board, r + 1, 0); // Move to the next row
            return;
        }

        if (board[r][c] != '.') {
            solve(board, r, c + 1); // Cell already filled, move to the next column
            return;
        }

        for (char num = '1'; num <= '9'; num++) {
            if (isValid(board, r, c, num)) {
                board[r][c] = num; // Place the valid number
                solve(board, r, c + 1); // Recursive call for the next column
                if (isSudokuSolved(board)) {
                    return; // If Sudoku is solved, exit recursion
                }
                board[r][c] = '.'; // Undo the placement if it leads to an invalid solution
            }
        }
    }

    public static boolean isValid(char[][] board, int r, int c, char val) {
        // Row check
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == val) {
                return false;
            }
        }

        // Column check
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == val) {
                return false;
            }
        }

        // Box check
        int br = 3 * (r / 3);
        int bc = 3 * (c / 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[br + i][bc + j] == val) {
                    return false;
                }
            }
        }

        return true; // Valid number
    }

    public static boolean isSudokuSolved(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

}
