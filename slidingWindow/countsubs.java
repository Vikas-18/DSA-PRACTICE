import java.util.HashMap;

public class countsubs {
    public static void main(String[] args) {
        String s = "aacaebceaac";
        System.out.println(substrCount(s, 4));
    }

    public static long substrCount(String s, int k) {

        long ans = 0;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            } else {
                map.put(s.charAt(j), 1);
            }

            if (map.size() < k) {

                j++;
            } else if (map.size() == k) {
                ans++;
                while (map.size() == k && map.size() < j - i + 1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    if (map.size() == k) {
                        ans++;
                    }
                    i++;
                }

                j++;
            } else {
                while (map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                if (map.size() == k) {
                    ans++;
                    while (map.size() == k && map.size() < j - i + 1) {
                        map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                        if (map.get(s.charAt(i)) == 0) {
                            map.remove(s.charAt(i));
                        }
                        if (map.size() == k) {
                            ans++;
                        }
                        i++;
                    }
                }
                j++;

            }
        }
        return ans;
    }
}
