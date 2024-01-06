public class longestsubstring {
    public static void main(String[] args) {
        String s = "babac";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int max = 0;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i;

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {

                if (max < r - l + 1) {
                    max = r - l + 1;
                    ans = s.substring(l, r + 1);
                }
                l--;
                r++;
            }

        }
        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {

                if (max < r - l + 1) {
                    max = r - l + 1;
                    ans = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }

        return ans;
    }
}
