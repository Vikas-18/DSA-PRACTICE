import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

public class wordsearchTwo {
    public static void main(String[] args) {
        String[][] board = { { "a", "b" }, { "c", "d" } };
        String[] words = { "abcb" };
        System.out.println(findWords(board, words));
    }

    public static ArrayList<String> findWords(String[][] board, String[] words) {
        Set<String> set = new HashSet<>();
        for (String s : words) {
            set.add(s);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                StringBuilder temp = new StringBuilder();
                boolean[][] vis = new boolean[board.length][board[0].length];
                solve(board, i, j, set, temp, vis);
            }
        }
        return list;
    }

    static ArrayList<String> list = new ArrayList<>();

    public static void solve(String[][] arr, int i, int j, Set<String> set, StringBuilder s, boolean[][] vis) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || vis[i][j] == true) {
            String temp = s.toString();
            if (set.contains(temp)) {
                list.add(temp);
            }
            return;
        }

        s.append(arr[i][j]);
        vis[i][j] = true;
        solve(arr, i + 1, j, set, s, vis);
        solve(arr, i - 1, j, set, s, vis);
        solve(arr, i, j + 1, set, s, vis);
        solve(arr, i, j - 1, set, s, vis);
        vis[i][j] = false;
        s.deleteCharAt(s.length() - 1);
    }
}
