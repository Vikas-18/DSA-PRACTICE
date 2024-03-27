public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 10, 29, 15, 30, 20 };
        System.out.println(solve(arr));
    }

    public static int solve(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                ans = Math.max(ans, arr[i]);
            }
        }
        if (ans == Integer.MIN_VALUE) {
            return -1;
        }
        return ans;
    }
}
