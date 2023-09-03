/**
 * perfectnumber
 */
public class perfectnumber {

    public static void main(String[] args) {
        int n = 6;

        System.out.println(solve(n));
    }

    public static String solve(int n) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                ans += i;
            }
        }
        String res = "";
        if (ans == n) {
            res += "YES";
        } else
            res += "NO";
        return res;
    }
}