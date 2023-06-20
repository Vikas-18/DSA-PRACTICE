import java.util.ArrayList;

public class nqueens {
    public static void main(String[] args) {
        // System.out.println(nQueen(8));
        // 1 0 0 0
        // 0 0 1 0
        // 0 0 0 0
        int n = 4;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
            }
        }
        Nqueen(arr, 0);
        System.out.println(ans);

    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] chess, int n, int r, int c) {
        for (int i = r; i >= 0; i--) {
            if (chess[i][c] == 1)
                return false;
        }

        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1)
                return false;
        }

        for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) {
            if (chess[i][j] == 1)
                return false;
        }

        return true;
    }

    public static ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public static void solve(int[][] chess, int n, int r) {
        // base case
        if (r == n) {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (chess[i][j] == 1) {
                        ans.add(j + 1);// only storing values of indexes where queens are placed
                    }
                }
            }
            res.add(new ArrayList<>(ans));
            return;
        }

        // checking possiblities
        for (int i = 0; i < n; i++) {
            if (isSafe(chess, n, r, i)) {
                chess[r][i] = 1;
                solve(chess, n, r + 1);
                chess[r][i] = 0;// backtrack
            }
        }
    }

    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int[][] chess = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 0;
            }
        }

        solve(chess, n, 0);
        return res;
    }

    public static int ans = 0;

    public static void Nqueen(int[][] arr, int r) {
        if (r == arr.length) {
            ans++;
            print(arr);
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (validhai(arr, r, i)) {
                arr[r][i] = 1;
                Nqueen(arr, r + 1);
                arr[r][i] = 0;
            }
        }
    }

    public static boolean validhai(int[][] arr, int r, int i) {
        // row check
        for (int idx = r; idx >= 0; idx--) {
            if (arr[idx][i] == 1) {
                return false;
            }
        }

        // left diagonal
        int dr = r;
        int dc = i;
        while (dr >= 0 && dc >= 0) {
            if (arr[dr][dc] == 1) {
                return false;
            }
            dr--;
            dc--;
        }
        dr = r;
        dc = i;
        // right diagonal
        while (dr >= 0 && dc < arr[0].length) {
            if (arr[dr][dc] == 1) {
                return false;
            }
            dr--;
            dc++;
        }

        return true;
    }
}
