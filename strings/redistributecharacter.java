import java.util.HashMap;

public class redistributecharacter {
    public static void main(String[] args) {
        String[] words = { "abc", "aabc", "bc" };
        System.out.println(makeEqual(words));
    }

    public static boolean makeEqual(String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();
        String temp = "";

        for (int i = 0; i < words.length; i++) {
            temp += words[i];
        }

        for (int i = 0; i < temp.length(); i++) {
            if (map.containsKey(temp.charAt(i))) {
                map.put(temp.charAt(i), map.get(temp.charAt(i)) + 1);
            } else {
                map.put(temp.charAt(i), 1);
            }
        }
        int size = words.length;
        for (Character it : map.keySet()) {
            if (map.get(it) % size != 0) {
                return false;
            }
        }
        return true;
    }
}
