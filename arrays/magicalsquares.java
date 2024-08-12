import java.util.HashSet;
import java.util.Set;

public class magicalsquares {
    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 8, 4 }, { 9, 5, 1, 9 }, { 2, 7, 6, 2 } };
        System.out.println(numMagicSquaresInside(grid));
    }

    public static int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (solve(i, j, grid)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static boolean solve(int row, int col, int[][] arr) {
        // distinct elements and within range 1-9
        Set<Integer> set = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (arr[i][j] >= 1 && arr[i][j] <= 9) {
                    set.add(arr[i][j]);
                }
            }
        }
        if (set.size() < 9) {
            return false;
        }

        // row wise sum
        for (int i = row; i < row + 3; i++) {
            int sum = 0;
            for (int j = col; j < col + 3; j++) {
                sum += arr[i][j];
            }
            if (sum != 15)
                return false;
        }

        // col wise sum
        for (int j = col; j < col + 3; j++) {
            int sum = 0;
            for (int i = row; i < row + 3; i++) {
                sum += arr[i][j];
            }
            if (sum != 15)
                return false;
        }

        // left diagonal wise sum

        int i = row;
        int j = col;
        int sum = 0;
        while (i < row + 3 && j < col + 3) {
            sum += arr[i][j];
            i++;
            j++;
        }
        if (sum != 15)
            return false;

        // right diagonal sum
        i = row;
        j = col + 2;
        sum = 0;
        while (i < row + 3 && j >= 0) {
            sum += arr[i][j];
            i++;
            j--;
        }
        if (sum != 15)
            return false;

        return true;
    }
}
