public class wordSearch {
    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        System.out.println(exist2(board, word));
    }

    public static boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == word.charAt(0)) {
                    boolean check = solve(vis, board, word, 0, i, j, n, m);
                    if (check == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean solve(boolean[][] vis, char[][] arr, String word, int idx, int r, int c, int n, int m) {

        if (idx == word.length()) {
            return true;
        }
        if (r >= n || r < 0 || c >= m || c < 0) {
            return false;
        }

        boolean left = false;
        if (vis[r][c] == false && arr[r][c] == word.charAt(idx)) {
            vis[r][c] = true;
            left = solve(vis, arr, word, idx + 1, r, c - 1, n, m);
            vis[r][c] = false;
        }

        boolean right = false;

        if (vis[r][c] == false && arr[r][c] == word.charAt(idx)) {
            vis[r][c] = true;
            right = solve(vis, arr, word, idx + 1, r, c + 1, n, m);
            vis[r][c] = false;
        }

        boolean up = false;

        if (vis[r][c] == false && arr[r][c] == word.charAt(idx)) {
            vis[r][c] = true;
            up = solve(vis, arr, word, idx + 1, r - 1, c, n, m);
            vis[r][c] = false;
        }

        boolean down = false;

        if (vis[r][c] == false && arr[r][c] == word.charAt(idx)) {
            vis[r][c] = true;
            down = solve(vis, arr, word, idx + 1, r + 1, c, n, m);
            vis[r][c] = false;
        }

        return left | right | up | down;
    }

    public static boolean solve2(int row, int col, int index, char[][] board, String word, int length, int n, int m,
            int[][] visited) {
        if (index == length) {
            return true;
        }

        boolean down = false, up = false, right = false, left = false;

        // Downwards
        if (row + 1 < n && board[row][col] == word.charAt(index) && visited[row + 1][col] == 0) {
            visited[row][col] = 1;
            down = solve2(row + 1, col, index + 1, board, word, length, n, m, visited);
            visited[row][col] = 0;
        }

        // Rightwards
        if (col + 1 < m && board[row][col] == word.charAt(index) && visited[row][col + 1] == 0) {
            visited[row][col] = 1;
            right = solve2(row, col + 1, index + 1, board, word, length, n, m, visited);
            visited[row][col] = 0;
        }

        // Upwards
        if (row - 1 >= 0 && board[row][col] == word.charAt(index) && visited[row - 1][col] == 0) {
            visited[row][col] = 1;
            up = solve2(row - 1, col, index + 1, board, word, length, n, m, visited);
            visited[row][col] = 0;
        }

        // Leftwards
        if (col - 1 >= 0 && board[row][col] == word.charAt(index) && visited[row][col - 1] == 0) {
            visited[row][col] = 1;
            left = solve2(row, col - 1, index + 1, board, word, length, n, m, visited);
            visited[row][col] = 0;
        }

        return down || up || right || left;
    }

    public static boolean exist2(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int[][] visited = new int[n][m];
        int length = word.length();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (board[i][j] == word.charAt(0) && solve2(i, j, 0, board, word, length, n, m, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
