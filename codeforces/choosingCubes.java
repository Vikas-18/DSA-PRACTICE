import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class choosingCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr, n, f, k));
        }
        sc.close();
    }

    public static String solve(int[] arr, int n, int f, int k) {
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
        int favnum = arr[f - 1];
        Arrays.sort(nums, Collections.reverseOrder());

        // Count occurrences of favorite number within first k elements
        int countFavInK = 0;
        for (int i = 0; i < k; i++) {
            if (nums[i] == favnum) {
                countFavInK++;
            }
        }

        // Count total occurrences of favorite number
        int totalCountFav = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == favnum) {
                totalCountFav++;
            }
        }

        if (countFavInK == totalCountFav) {
            // All instances of favnum are within the first k elements
            return "YES";
        } else if (countFavInK == 0) {
            // No instance of favnum within the first k elements
            return "NO";
        } else {
            // Some but not all instances of favnum are within the first k elements
            return "MAYBE";
        }
    }
}
