public class findminhard {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 0, 1 };
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int ans = 0, s = 0, e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] >= nums[0]) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
            while (s <= e && s + 1 < nums.length && nums[s + 1] == nums[s]) {
                s++;
            }
            while (s <= e && e - 1 >= 0 && nums[e - 1] == nums[e]) {
                e--;
            }
        }
        return nums[ans];
    }
}
