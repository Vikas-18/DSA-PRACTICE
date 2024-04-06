public class ork {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 32, 21 };
        int k = 55;
        System.out.println(minimumSubarrayLength(nums, k));
    }

    public static int minimumSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int or = 0;
        int ans = (int) (1e9);

        while (j < nums.length) {
            or = or | nums[j];

            if (or < k) {
                j++;
            } else {
                while (i <= j && or >= k) {

                    ans = Math.min(ans, j - i + 1);
                    or = Math.abs(or ^ (~nums[i]));
                    i++;
                }

                j++;
            }
        }
        if (ans == (int) (1e9)) {
            return -1;
        }
        return ans;
    }
}
