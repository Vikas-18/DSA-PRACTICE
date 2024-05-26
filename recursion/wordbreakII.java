import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

public class wordbreakII {
    public static void main(String[] args) {
        String s = "catsanddog";
        String[] wordDict = { "cat", "cats", "and", "sand", "dog" };
        System.out.println(wordBreak(s, wordDict));

    }

    public static ArrayList<String> wordBreak(String s, String[] wordDict) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < wordDict.length; i++) {
            set.add(wordDict[i]);
        }
        ArrayList<String> temp = new ArrayList<>();
        solve(s, 0, set, temp);
        return ans;
    }

    static ArrayList<String> ans = new ArrayList<>();

    public static void solve(String s, int idx, Set<String> set, ArrayList<String> temp) {
        if (idx == s.length()) {
            if (temp.size() == 0) {
                return;
            }
            String st = "";
            for (int i = 0; i < temp.size(); i++) {
                for (int j = 0; j < temp.get(i).length(); j++) {
                    st += temp.get(i).charAt(j);
                }
            }
            if (st.length() != s.length()) {
                return;
            }

            String res = "";
            for (int i = 0; i < temp.size(); i++) {
                if (i == temp.size() - 1) {
                    res += temp.get(i);
                } else {
                    res += temp.get(i);
                    res += " ";
                }
            }
            ans.add(res);
        }

        for (int i = idx; i < s.length(); i++) {

            if (set.contains(s.substring(idx, i + 1))) {
                temp.add(s.substring(idx, i + 1));
                solve(s, i + 1, set, temp);
                temp.remove(temp.size() - 1);
            }

        }
    }
}
