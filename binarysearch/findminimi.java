/**
 * findminimi
 */
public class findminimi {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 3 };
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {

        int s = 0;
        int e = nums.length - 1;
        if (nums[s] <= nums[e])
            return nums[0];
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (s < e && (nums[s] == nums[e])) {
                s++;
                e--;
                if (s == e) {
                    return nums[s];
                }
            } else if (nums[mid] >= nums[0]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return nums[s];

    }
}