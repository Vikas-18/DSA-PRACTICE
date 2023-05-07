import java.util.*;
public class countAnagrams {


    public static void main(String[] args) {
       String s = "forxxorfxdofr";
       String ptr = "fox";
       System.out.println(solve(s, ptr));
    }
    public static int solve(String s,String ptr)
    {
        int k = ptr.length();

        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < k; ++i) {
            char c = ptr.charAt(i);
             if(mp.containsKey(c))
             {
                mp.put(c,mp.get(c)+1);
             }
             else{
                mp.put(c,1);
             }
        }

        int i = 0,j = 0;
        int ans = 0;
        int count = mp.size();

        while (j < s.length()) {
            char c = s.charAt(j);
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) - 1);
                if (mp.get(c) == 0) {
                    count--;
                }
            }

             if (j -i + 1 < k) {
               j++;
            } 
            else if(j-i+1==k) {
                if (count == 0) {
                    ans++;
                }
                if (mp.containsKey(s.charAt(i))) {
                    mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
                    if (mp.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
               i++;
               j++;
            }
        }
        return ans;
    }
}
