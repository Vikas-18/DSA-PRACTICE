public class changearr {
    public static void main(String[] args) {
        int[][] grid = { { 1 }, { 2 }, { 3 } };
        System.out.println(minimumOperations(grid));
    }

    public static int minimumOperations(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i + 1 < grid.length && grid[i][j] != grid[i + 1][j]) {
                    grid[i + 1][j] = grid[i][j];
                    ans++;
                }
                if (j + 1 < grid[0].length && grid[i][j] == grid[i][j + 1]) {
                    ans++;
                    grid[i][j + 1] = grid[i][j] - 1;
                }
            }
        }
        return ans;
    }
}
