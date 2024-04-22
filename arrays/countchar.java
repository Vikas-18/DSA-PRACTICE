import java.util.HashMap;

public class countchar {
    public static void main(String[] args) {
        String word = "cCceDC";
        System.out.println(numberOfSpecialChars(word));
    }

    public static int numberOfSpecialChars(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c))
                map.put(c, i);
        }
        boolean[] vis = new boolean[26];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {

                char lowerCaseC = Character.toLowerCase(c);
                if (map.containsKey(lowerCaseC) && map.get(lowerCaseC) < i && vis[c - 'A'] == false) {

                    ans++;
                    map.remove(lowerCaseC);
                }
                vis[c - 'A'] = true;
            }
        }
        return ans;
    }
}
