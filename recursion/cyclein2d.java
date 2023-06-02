public class cyclein2d {
    public static void main(String[] args) {
        char[][] grid = { { 'c', 'c', 'c', 'a' },
                { 'c', 'd', 'c', 'c' },
                { 'c', 'c', 'e', 'c' },
                { 'f', 'c', 'c', 'c' } };
        System.out.println(containsCycle(grid));
    }

    public static boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean ans = solve(grid, i, j, i, j, vis, n, m);
                if (ans) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solve(char[][] arr, int sr, int sc, int r, int c, boolean[][] vis, int n, int m) {
        if (vis[sr][sc] == true) {
            return true;
        }

        boolean up = false;
        boolean down = false;
        boolean left = false;
        boolean right = false;
        if (r - 1 >= 0 && r < n && c >= 0 && c < m && vis[r - 1][c] == false && arr[r - 1][c] == arr[sr][sc]) {
            vis[r - 1][c] = true;
            up = solve(arr, sr, sc, r - 1, c, vis, n, m);
            vis[r - 1][c] = false;
        }
        if (r >= 0 && r + 1 < n && c >= 0 && c < m && vis[r + 1][c] == false && arr[r + 1][c] == arr[sr][sc]) {
            vis[r + 1][c] = true;
            down = solve(arr, sr, sc, r + 1, c, vis, n, m);
            vis[r + 1][c] = false;
        }
        if (r >= 0 && r < n && c >= 0 && c + 1 < m && vis[r][c + 1] == false && arr[r][c + 1] == arr[sr][sc]) {
            vis[r][c + 1] = true;
            right = solve(arr, sr, sc, r, c + 1, vis, n, m);
            vis[r][c + 1] = false;
        }
        if (r >= 0 && r < n && c - 1 >= 0 && c < m && vis[r][c - 1] == false && arr[r][c - 1] == arr[sr][sc]) {
            vis[r][c - 1] = true;
            left = solve(arr, sr, sc, r, c - 1, vis, n, m);
            vis[r][c - 1] = false;
        }

        return left | right | up | down;
    }
}
