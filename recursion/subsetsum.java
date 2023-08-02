
import java.util.ArrayList;
import java.util.Arrays;

public class subsetsum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 5, 3, 5 };
        System.out.println(thirdMax(arr));
    }

    static int subset(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum = 2 * sum;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[i] + arr[j];
            }
        }
        return sum;
    }

    static void subsetsumprint(int[] arr, int idx, int sum, ArrayList<Integer> ans) {
        if (idx == arr.length) {
            ans.add(sum);
            if (sum == 0)

                System.out.println(ans);

            return;
        }

        sum += arr[idx];
        subsetsumprint(arr, idx + 1, sum, ans);
        sum -= arr[idx];
        subsetsumprint(arr, idx + 1, sum, ans);

    }

    static int maximumWealth(int[][] arr) {

        int maxsum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
                if (maxsum < sum) {
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        int maximum = -3121211;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i > 0 && nums[i] > nums[i - 1])
                counter++;
            if (counter == 3) {
                return nums[i - 1];
            }
        }

        if (nums.length < 3 || counter < 3) {
            return nums[nums.length - 1];
        }
        return -1;

    }
}
