import java.util.Arrays;

/**
 * quicksort
 */
public class quicksort {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 13, 5 };
        solve(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void solve(int[] arr, int lo, int hi) {

        if (lo >= hi) {
            return;
        }

        int s = lo;
        int e = hi;

        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        solve(arr, lo, e);
        solve(arr, s, hi);
    }
}