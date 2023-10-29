
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;

/**
 * combinationsumunique
 */
public class combinationsumunique {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 1, 2 };
        System.out.println(combinationSum2(arr, 5));
    }

    public static ArrayList<ArrayList<Integer>> combinationSum2(int[] arr, int t) {
        ArrayList<Integer> ArrayList = new ArrayList<>();
        solve(arr, 0, t, ArrayList);
        return new ArrayList<>(ans);
    }

    public static HashSet<ArrayList<Integer>> ans = new HashSet<>();

    public static void solve(int[] arr, int idx, int t, ArrayList<Integer> list) {
        if (idx == arr.length) {
            if (t == 0) {
                Collections.sort(list);
                ans.add(new ArrayList<>(list));

            }
            return;
        }

        list.add(arr[idx]);
        t -= arr[idx];
        solve(arr, idx + 1, t, list);
        t += arr[idx];
        list.remove(list.size() - 1);
        solve(arr, idx + 1, t, list);
    }
}