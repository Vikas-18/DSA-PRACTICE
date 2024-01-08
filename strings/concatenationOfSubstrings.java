import java.util.HashMap;
import java.util.ArrayList;

public class concatenationOfSubstrings {
    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
        String[] words = { "bar", "foo", "the" };
        System.out.println(findSubstring(s, words));
    }

    public static ArrayList<Integer> findSubstring(String s, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int size = 0;
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    temp += words[j];
                }
            }
            size = temp.length();
            map.put(temp, 1);
        }

        int i = 0;
        int j = size - 1;
        ArrayList<Integer> ans = new ArrayList<>();

        while (j < s.length()) {
            if (map.containsKey(s.substring(i, j + 1))) {
                ans.add(i);
            }
            i++;
            j++;
        }
        return ans;

    }
}
