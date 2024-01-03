package twoD_DP;

import java.util.Scanner;

public class infosyspractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int mod = 1000000007;
        long ans = 0;
        long a = arr[0][0], b = arr[0][1];
        ans = Math.max(a, b);

        for (int i = 1; i < N; i++) {
            long a1 = 0, b1 = 0;
            long c = arr[i - 1][0], d = arr[i - 1][1];

            if (c < arr[i][0] && d < arr[i][0]) {
                a1 = arr[i][0] + Math.max(a, b);
            } else if (c < arr[i][0]) {
                a1 = arr[i][0] + a;
            } else if (d < arr[i][0]) {
                a1 = arr[i][0] + b;
            }

            if (c < arr[i][1] && d < arr[i][1]) {
                b1 = arr[i][1] + Math.max(a, b);
            } else if (c < arr[i][1]) {
                b1 = arr[i][1] + a;
            } else if (d < arr[i][1]) {
                b1 = arr[i][1] + b;
            }

            a = a1;
            b = b1;
            ans = Math.max(ans, a);
            ans = Math.max(ans, b);
        }

        System.out.println(ans % mod);
    }

}
