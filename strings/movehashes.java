public class movehashes {
    public static void main(String[] args) {
        String s = "Move#Hash#to#Front";
        System.out.println(solve(s));
    }

    public static String solve(String s) {
        int hashes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                hashes++;
            }
        }

        String ans = "";
        for (int i = 0; i < hashes; i++) {
            ans += "#";
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
