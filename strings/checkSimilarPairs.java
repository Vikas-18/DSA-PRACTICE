import java.util.HashMap;

/**
 * checkSimilarPairs
 */
public class checkSimilarPairs {

    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }
    public static int similarPairs(String[] words) {
        int ans = 0;
        for(int i=0; i<words.length; i++)
        {
            for(int j=i+1; j<words.length; j++)
            {
                if(check(words[i],words[j]))
                ans++;
            }
        }
        return ans;
    }
    public static boolean check(String s,String t)
    {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            map1.put(s.charAt(i),1);
        }
        for(int i=0; i<t.length(); i++)
        {
            map2.put(t.charAt(i),1);
        }
        for(int i=0; i<t.length(); i++)
        {
            if(!map1.containsKey(t.charAt(i)))
            {
                return false;
            }
        }
        for(int i=0; i<s.length(); i++)
        {
            if(!map2.containsKey(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}