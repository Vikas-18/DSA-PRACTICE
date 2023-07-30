public class findpivot {
    public static void main(String[] args) {
        int[] nums = { 1, 3 };
        System.out.println(search(nums, 0));
    }

    static int pivot(int[] nums) {

        int s = 0;
        int e = nums.length - 1;
        if (nums.length == 1) {
            return 0;
        }
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (mid <= e && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            else if (mid >= s && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            else if (nums[s] > nums[mid]) {
                e = mid - 1;
            } else if (nums[s] > nums[mid]) {
                s = mid + 1;
            }
        }

        return -1;

    }

    public static int search(int[] nums, int target) {
        int pivot = pivot2(nums);
        int ans1 = bs(nums, 0, pivot, target);
        int ans2 = bs(nums, pivot + 1, nums.length - 1, target);
        if (ans1 == -1) {
            return ans2;
        }
        return ans1;

    }

    public static int pivot2(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (nums[mid] > nums[s]) {
                s = mid + 1;
            } else if (nums[mid] < nums[s]) {
                e = mid - 1;
            }
        }
        return nums.length - 1;
    }

    public static int bs(int[] arr, int s, int e, int t) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] > t) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
