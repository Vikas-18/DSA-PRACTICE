import java.util.HashMap;

public class secondUnique {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                if ( map.get(s.charAt(i)) == 2) {
                    return s.charAt(i);
                }
            }

            else {
                map.put(s.charAt(i), 1);
            }
        }
        int ans = s.length()-1;
        return s.charAt(ans);
    }
}
