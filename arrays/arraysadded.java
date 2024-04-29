import java.util.Arrays;

/**
 * arraysadded
 */
public class arraysadded {

    public static void main(String[] args) {
        int[] arr1 = { 4, 7, 5 };
        int[] arr2 = { 5 };
        System.out.println(minimumAddedInteger(arr1, arr2));
    }

    public static int minimumAddedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int res = (int) (1e9);

        int ans1 = nums2[0] - nums1[0];
        int ans2 = nums1[0] - nums2[0];
        int ans3 = nums2[0] - nums1[2];
        int ans4 = nums1[2] - nums2[0];

        if (nums1[0] + ans1 == nums2[0]) {
            if (Math.abs(ans1) < res)
                res = Math.min(res, ans1);
        }

        if (nums1[0] + ans2 == nums2[0]) {
            if (Math.abs(ans2) < res)
                res = Math.min(res, ans2);
        }

        if (nums1[2] + ans3 == nums2[0]) {
            if (Math.abs(ans3) < res)
                res = Math.min(res, ans3);
        }

        if (nums1[2] + ans4 == nums2[0]) {
            if (Math.abs(ans4) < res)
                res = Math.min(res, ans4);
        }

        return res;

    }
}