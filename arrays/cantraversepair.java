import java.util.HashMap;

/**
 * cantraversepair
 */
public class cantraversepair {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 12, 8 };
        System.out.println(canTraverseAllPairs(nums));
    }

    public static boolean canTraverseAllPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int maxnum = max(nums);

        boolean[] vis = new boolean[maxnum + 1];

        for (int i = 0; i < nums.length; i++) {
            int factor = 2;
            while (nums[i] * factor <= maxnum) {
                if (map.containsKey(nums[i] * factor)) {
                    vis[nums[i]] = true;
                    vis[nums[i] * factor] = true;
                }
                factor++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (vis[nums[i]] == false) {
                return false;
            }
        }
        return true;
    }

    public static int max(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, nums[i]);
        }

        return ans;
    }
}