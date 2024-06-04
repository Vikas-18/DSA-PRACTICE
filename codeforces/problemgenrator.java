import java.util.Scanner;

public class problemgenrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String s = sc.next();

            System.out.println(solve(s, n, m));
        }
    }

    public static int solve(String s, int n, int m) {

        int[] arr = new int[7];
        for (int i = 0; i < n; i++) {

            arr[s.charAt(i) - 'A']++;
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < m) {
                ans += m - arr[i];
            }
        }
        return ans;
    }
}
