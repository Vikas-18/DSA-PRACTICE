import java.util.HashMap;

public class longestSubstringWithKUniqueChar {
    public static void main(String[] args) {
        System.out.println(solve("aabaaabbcbbebeb", 3));
    }

    public static int solve(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int i = 0;
        int j = 0;

        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                int oldfrq = map.get(s.charAt(j));
                int newfrq = oldfrq + 1;
                map.put(s.charAt(j), newfrq);
            } else if (!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), 1);
            }

            if (map.size() < k) {
                j++;
            }

            else if (map.size() == k) {
                ans = Math.max(ans, j - i + 1);
                j++;
            }

            else if (map.size() > k) {
                while (map.size() > k) {
                    if (map.containsKey(s.charAt(j))) {
                        int oldfrq = map.get(s.charAt(i));
                        int newfrq = oldfrq - 1;
                        map.put(s.charAt(i), newfrq);
                    }
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
