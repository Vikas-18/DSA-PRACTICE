public class processString {
    public static void main(String[] args) {
        System.out.println(processStr("a#b%*"));
    }

    public static String processStr(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && ans.length() > 0) {
                ans.deleteCharAt(ans.length() - 1);
            } else if (s.charAt(i) == '#') {
                ans.append(ans.toString());
            } else if (s.charAt(i) == '%') {
                StringBuilder reversed = new StringBuilder(ans);
                ans.append(reversed.reverse());
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
    
}
