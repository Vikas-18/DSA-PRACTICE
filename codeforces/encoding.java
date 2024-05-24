import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            char[] arr = new char[set.size()];
            int idx = 0;
            for (Character ch : set) {
                arr[idx++] = ch;
            }
            Arrays.sort(arr);

            HashMap<Character, Character> map = new HashMap<>();

            int i = 0;
            int j = arr.length - 1;
            while (i <= j) {
                if (map.containsKey(arr[i])) {
                    i++;
                } else if (map.containsKey(arr[j])) {
                    j--;
                } else {
                    map.put(arr[i], arr[j]);
                    map.put(arr[j], arr[i]);
                    i++;
                    j--;
                }
            }
            StringBuilder ans = new StringBuilder();

            for (int k = 0; k < s.length(); k++) {
                ans.append(map.get(s.charAt(k)));
            }

            System.out.println(ans.toString());

        }
    }
}
