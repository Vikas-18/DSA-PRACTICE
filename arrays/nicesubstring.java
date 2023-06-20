import java.util.HashMap;

public class nicesubstring {
    public static void main(String[] args) {
        String s = "aA";
        System.out.println(check(s));
    }

    public static String longestNiceSubstring(String s) {
        // 32
        int l = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                temp += s.charAt(j);
                if (check(temp)) {
                    if (j - i + 1 > l) {
                        l = Math.max(l, j - i + 1);
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }

    public static boolean check(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey((int) (s.charAt(i)))) {
                map.put((int) (s.charAt(i)), map.get((int) (s.charAt(i)) + 1));
            } else {
                map.put((int) (s.charAt(i)), 1);
            }
        }
        for (Integer c : map.keySet()) {
            if (!map.containsKey(c + 32) && !map.containsKey(c - 32)) {
                return false;
            }
        }
        return true;
    }
}
