
/**
 * subarrayofmin
 */
public class subarrayofmin {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        System.out.println(sumSubarrayMins(arr));

    }

    public static int sumSubarrayMins(int[] arr) {

        int ans = 0;
        int min = (int) (1e9);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                min = Math.min(arr[j], min);
                ans += min;
            }
            min = (int) (1e9);
        }
        return ans;
    }
}