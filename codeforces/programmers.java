import java.util.Arrays;
import java.util.Scanner;

public class programmers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr1 = new int[n + m + 1];
            int[] arr2 = new int[n + m + 1];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(solve(arr1, arr2, n, m)));
        }

    }

    public static int[] solve(int[] arr1, int[] arr2, int n, int m) {
        int[] ans = new int[n + m + 1];
        int temp1 = n;
        int temp2 = m;
        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            n = temp1;
            m = temp2;
            for (int j = 0; j < arr2.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (n > 0 && arr1[j] > arr2[j]) {
                        sum += arr1[j];
                        n--;
                    } else if (m > 0 && arr1[j] < arr2[j]) {
                        sum += arr2[j];
                        m--;
                    } else if (n > 0 && m < 0 && arr1[j] < arr2[j]) {
                        sum += arr1[j];
                        n--;
                    } else if (n < 0 && m > 0 && arr1[j] > arr2[j]) {
                        sum += arr2[j];
                        m--;
                    }
                }
            }
            ans[i] = sum;
        }
        return ans;
    }

}
