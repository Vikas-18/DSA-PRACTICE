public class equalvowels {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int idx = 0; idx < s.length() / 2; idx++) {
            if (s.charAt(idx) == 'a' || s.charAt(idx) == 'A') {
                a++;
            } else if (s.charAt(idx) == 'e' || s.charAt(idx) == 'E') {
                e++;
            } else if (s.charAt(idx) == 'i' || s.charAt(idx) == 'I') {
                i++;
            } else if (s.charAt(idx) == 'o' || s.charAt(idx) == 'O') {
                o++;
            } else if (s.charAt(idx) == 'u' || s.charAt(idx) == 'U') {
                u++;
            }
        }
        for (int idx = s.length() / 2; idx < s.length(); idx++) {
            if (s.charAt(idx) == 'a' || s.charAt(idx) == 'A') {
                a--;
            } else if (s.charAt(idx) == 'e' || s.charAt(idx) == 'E') {
                e--;
            } else if (s.charAt(idx) == 'i' || s.charAt(idx) == 'I') {
                i--;
            } else if (s.charAt(idx) == 'o' || s.charAt(idx) == 'O') {
                o--;
            } else if (s.charAt(idx) == 'u' || s.charAt(idx) == 'U') {
                u--;
            }
        }

        if (a == 0 && e == 0 && i == 0 && o == 0 && u == 0) {
            return true;
        }
        return false;
    }
}
