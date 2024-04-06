/**
 * leetcodeque
 */
public class leetcodeque {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 1, 1, 1, 0 };
        System.out.println(countAlternatingSubarrays(nums));
    }

    public static long countAlternatingSubarrays(int[] nums) {
        long ans = 0;

        int i = 0;
        int j = 1;
        int lastnum = nums[0];
        ans++;
        while (j < nums.length) {

            if (lastnum != nums[j]) {
                ans += (j - i + 1);
                lastnum = nums[j];
                j++;
            } else {
                while (i < j && lastnum == nums[j]) {
                    i++;
                }
                if (i == j) {
                    ans++;
                } else if (lastnum != nums[j]) {
                    ans += (j - i + 1);
                    lastnum = nums[j];

                }

                j++;
            }
        }
        return ans;
    }
}