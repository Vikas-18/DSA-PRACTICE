import java.util.Scanner;

public class incdeccopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n + 1];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }

            System.out.println(solve(a, b));
        }
    }

    public static int solve(int[] a, int[] b) {

        int diff = b[b.length - 1];

        for (int i = 0; i < a.length; i++) {
            diff = Math.min(diff, Math.abs(diff - a[i]));
        }

        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += Math.abs(a[i] - b[i]);
        }

        return ans + Math.abs(diff - b[b.length - 1]);
    }
}
