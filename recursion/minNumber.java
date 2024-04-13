public class minNumber {
    public static void main(String[] args) {
        String num = "1432219";
        System.out.println(removeKdigits(num, 3));

    }

    public static String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }
        StringBuilder s = new StringBuilder();
        solve(num, 0, k, k, s);
        return ans;
    }

    public static String ans = "10000000";

    public static void solve(String num, int idx, int len, int k, StringBuilder s) {
        if (idx == num.length()) {
            if (num.length() - len < 0) {
                if (Integer.valueOf(s.toString()) < Integer.valueOf(ans)) {
                    ans = s.toString();
                }
            }
            return;
        }
        if (num.length() - len < 0) {
            if (Integer.valueOf(s.toString()) < Integer.valueOf(ans)) {
                ans = s.toString();
            }
            return;
        }

        solve(num, idx + 1, len, k, s);

        s.append(num.charAt(idx));
        k--;
        solve(num, idx + 1, len, k, s);
        k++;
        s.deleteCharAt(s.length() - 1);
    }

}
