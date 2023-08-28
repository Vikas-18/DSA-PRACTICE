import java.util.Arrays;

/**
 * zs
 */
public class zs {

    public static void main(String[] args) {
        int[][] arr = { { 5, 10 }, { 8, 12 } };
        System.out.println(coverage(2, arr));
    }

    public static int coverage(int n, int[][] arr) {
        // The maximum length of street covered by input2
        int dist = arr[0][1] - arr[0][0];
        int prev = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[prev][1] > arr[i][0]) {
                dist += arr[i][1] - arr[prev][1];
            } else {
                dist += arr[i][1] - arr[i][0];
            }
            prev = i;
        }

        return dist;

    }
}