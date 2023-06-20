
/**
 * permutations
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class permutations {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3 };
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] f = new boolean[arr.length];
        ArrayList<ArrayList<Integer>> fg = new ArrayList<>();
        // permute2(arr, f, ans, list);
        solve(arr, 0, list, f);
        System.out.println(ans);
    }

    static void permute(int[] arr, boolean[] f, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> list) {
        if (ans.size() == arr.length)
            list.add(new ArrayList<>(ans));

        for (int i = 0; i < arr.length; i++) {
            if (!f[i]) {

                f[i] = true;
                ans.add(arr[i]);
                permute(arr, f, ans, list);
                f[i] = false;
                ans.remove(ans.size() - 1);

            }
        }
    }

    static void permute2(int[] arr, boolean[] f, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> list) {
        if (ans.size() == arr.length)
            list.add(new ArrayList<>(ans));

        for (int i = 0; i < arr.length; i++) {
            if (f[i] || (i > 0 && arr[i] == arr[i - 1]) && !f[i]) {
                continue;

            }

            if (!f[i]) {
                f[i] = true;
                ans.add(arr[i]);
                permute(arr, f, ans, list);
                f[i] = false;
                ans.remove(ans.size() - 1);
            }

        }
    }

    public static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public static void solve(int[] nums, int idx, ArrayList<Integer> list, boolean[] vis) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                continue;
            if (vis[i] == false) {

                vis[i] = true;
                list.add(nums[i]);
                set.add(nums[i]);
                solve(nums, idx + 1, list, vis);
                vis[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}