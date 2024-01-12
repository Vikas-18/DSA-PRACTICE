import java.util.ArrayList;
import java.util.Arrays;

public class digitformation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numsSameConsecDiff(3, 7)));
    }

    public static int[] numsSameConsecDiff(int n, int k) {
        StringBuilder s = new StringBuilder();
        solve(n, k, 0, s);
        int[] arr = new int[ans.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    static ArrayList<Integer> ans = new ArrayList<>();

    public static void solve(int n, int k, int idx, StringBuilder s) {
        if (idx == n) {
            ans.add(Integer.parseInt(s.toString()));
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (idx == 0 && i == 0) {
                continue;
            } else if (idx == 0 && i != 0) {
                s.append(i);
                solve(n, k, idx + 1, s);
                s.deleteCharAt(s.length() - 1);
            } else {
                if ((s.charAt(idx - 1) - 48) - i == k || (s.charAt(idx - 1) - 48) - i == -k) {
                    s.append(i);
                    solve(n, k, idx + 1, s);
                    s.deleteCharAt(s.length() - 1);
                }
            }
        }
    }
}
