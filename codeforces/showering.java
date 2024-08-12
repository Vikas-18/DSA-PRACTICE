import java.util.Scanner;

import java.util.Arrays;

public class showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();

            int[][] intervals = new int[n][2];
            for (int i = 0; i < n; i++) {
                intervals[i][0] = sc.nextInt();
                intervals[i][1] = sc.nextInt();
            }

            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

            boolean canShower = false;

            if (intervals[0][0] >= s) {
                canShower = true;
            }

            for (int i = 1; i < n; i++) {
                if (intervals[i][0] - intervals[i - 1][1] >= s) {
                    canShower = true;
                }
            }

            if (m - intervals[n - 1][1] >= s) {
                canShower = true;
            }

            if (canShower) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
