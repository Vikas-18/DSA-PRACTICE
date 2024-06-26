public class minimumovesformakeone {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 0 };
        System.out.println(minOperations(arr));
    }

    public static int minOperations(int[] nums) {
        int ans = 0;
        int n = nums.length;

        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                idx = i;
                break;
            }
        }
        if (idx == -1)
            return 0;
        int i = idx;
        int j = idx;

        while (j < n) {
            if (nums[j] == 0) {
                nums[j] = 1;
            } else {
                nums[j] = 0;
            }
            if (j - i + 1 < 3) {
                j++;
            } else if (j - i + 1 == 3) {

                if (nums[j] == 0) {
                    nums[j] = 1;
                } else {
                    nums[j] = 0;
                }
                ans++;
                j++;
            } else {
                i++;
                j++;
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }
        return ans;

    }
}
