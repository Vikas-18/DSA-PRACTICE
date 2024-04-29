
/**
 * samerowcol1
 */
public class samerowcol1 {

    public static void main(String[] args) {
        int[][] grid = { { 0, 1, 0 }, { 0, 1, 1 }, { 0, 1, 0 } };
        System.out.println(numberOfRightTriangles(grid));
    }

    public static long numberOfRightTriangles(int[][] grid) {
        long ans = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {

                    int row = i;

                    while (row < grid.length) {
                        int col = 0;
                        if (row != i && grid[row][j] == 1) {
                            while (col < grid[0].length) {
                                if (grid[i][col] == 1 && col != j) {
                                    ans++;
                                }
                                col++;
                            }
                        }
                        row++;
                    }
                }
            }
        }
        return ans % (int) (1e9);
    }
}