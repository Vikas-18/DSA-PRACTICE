import java.util.Arrays;

public class assigncookies {
    public static void main(String[] args) {
        int[] g = { 1, 2, 3 };
        int[] s = { 1, 1 };
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0; i<s.length; i++)
        // {
        // if(map.containsKey(s[i]))
        // {
        // map.put(s[i],map.get(s[i])+1);
        // }
        // else
        // {
        // map.put(s[i],1);
        // }
        // }
        boolean[] vis = new boolean[s.length];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i] && vis[j] == false) {
                    ans++;
                    vis[j] = true;
                    break;
                }
            }
        }
        return ans;
    }
}
