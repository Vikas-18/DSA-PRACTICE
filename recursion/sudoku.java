import java.util.HashSet;

/**
 * sudoku
 */
public class sudoku {

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

        System.out.println(isValidSudoku(arr));

    }

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && isValid(board, i, j, board[i][j]) == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int r, int c, char val) {
        // row check
        for (int i = 0; i < 9; i++) {
            if (i != c && board[r][i] == val) {
                return false;
            }
        }

        // col check
        for (int i = 0; i < 9; i++) {
            if (i != r && board[i][c] == val) {
                return false;
            }
        }

        // Box check
        int br = 3 * (r / 3);
        int bc = 3 * (c / 3);
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[br + i][bc + j] != '.') {
                    if (set.contains(board[br + i][bc + j])) {
                        return false;
                    } else {
                        set.add(board[br + i][bc + j]);
                    }
                }
            }
        }
        return true;
    }
}