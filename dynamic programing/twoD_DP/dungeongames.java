package twoD_DP;

public class dungeongames {
    public static void main(String[] args) {
        int[][] dungeon = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
        System.out.println(calculateMinimumHP(dungeon));
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        return solve(dungeon, 0, 0);
    }

    public static int solve(int[][] arr, int i, int j) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return arr[i][j];
        }
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length) {
            return Integer.MAX_VALUE; // Return a large value for invalid paths
        }

        int down = arr[i][j] + solve(arr, i + 1, j);
        int right = arr[i][j] + solve(arr, i, j + 1);

        // Return the sum of the current cell and the minimum absolute sum of the next
        // cells
        return Math.min(Math.abs(down), Math.abs(right));
    }

}
