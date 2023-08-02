import java.util.Arrays;

public class dboi {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 6, 6, 5 };
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                int s = 0;
                int e = arr.length - 1;
                int cnt = 0;
                while (s < e) {
                    if (arr[s] + arr[e] == sum) {
                        cnt++;
                        s++;
                        e--;
                    } else if (arr[s] + arr[e] > sum) {
                        e--;
                    } else {
                        s++;
                    }
                }
                ans = Math.max(cnt, ans);
            }
        }
        System.out.println(ans);
        System.out.println(solve(arr, 5));
    }

    public static int solve(int[] arr, int N) {
        Arrays.sort(arr);

        int left = 0;
        int right = N - 1;
        int pairs = 0;

        while (left < right) {
            if (arr[left] + arr[right] == arr[left + 1] + arr[right - 1]) {
                pairs++;
                left++;
                right--;
            } else if (arr[left] + arr[right] < arr[left + 1] + arr[right - 1]) {
                left++;
            } else {
                right--;
            }
        }

        return pairs;
    }
}
