/**
 * maxele
 */
public class maxele {

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2 };
        System.out.println(max(nums));
    }

    public static int max(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if ((mid + 1 < n && arr[mid] > arr[mid + 1])) {
                return mid;
            } else if (mid - 1 >= 0 && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] > arr[s]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}