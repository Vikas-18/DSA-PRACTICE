import java.util.HashMap;

public class CountandPrintOccurences {
    public static void main(String[] args) {
        String s = "aabbbbeeeeffggg";
        System.out.println(solve(s));
    }

    public static String solve(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        String ans = "";
        for (Character ch : map.keySet()) {
            ans = ans + ch + String.valueOf(map.get(ch));
        }
        return ans;
    }
}
