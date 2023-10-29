import java.util.HashMap;

public class maxvowels {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }

    public static int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;

        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            } else {
                map.put(s.charAt(j), 1);
            }

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {
                int temp = 0;
                if (map.containsKey('a')) {
                    temp += map.get('a');
                }
                if (map.containsKey('e')) {
                    temp += map.get('e');
                }
                if (map.containsKey('i')) {
                    temp += map.get('i');
                }
                if (map.containsKey('o')) {
                    temp += map.get('o');
                }
                if (map.containsKey('u')) {
                    temp += map.get('u');
                }
                ans = Math.max(ans, temp);
                j++;
            }

            else {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
                if (j - i + 1 == k) {
                    int temp = 0;
                    if (map.containsKey('a')) {
                        temp += map.get('a');
                    }
                    if (map.containsKey('e')) {
                        temp += map.get('e');
                    }
                    if (map.containsKey('i')) {
                        temp += map.get('i');
                    }
                    if (map.containsKey('o')) {
                        temp += map.get('o');
                    }
                    if (map.containsKey('u')) {
                        temp += map.get('u');
                    }
                    ans = Math.max(ans, temp);

                }

                j++;
            }
        }
        return ans;
    }
}
