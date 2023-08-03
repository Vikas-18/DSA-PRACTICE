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

    }

}
