import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class getSubsequence {
    public static void main(String[] args) {
        String s = "dsahjpjauf";
        String[] words = {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
        System.out.println(numMatchingSubseq(s, words));
    }
    public static int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++)
        {
            map.put(words[i],1);
        }
        char[]ch = s.toCharArray();
        ArrayList<Character> temp = new ArrayList<>();
        getSubsequence2(ch, 0, temp);
        int ans=0;
        for(String str: list)
        {
            if(map.containsKey(str))
            {
                ans++;
            }
        }
        return ans;

    }
    public static Set<String> list = new HashSet<>();
    public static void getSubsequence2(char[] s,int idx,ArrayList<Character> temp)
    {
        if(idx>=s.length)
        {
            String st = "";
            for (int i = 0; i < temp.size(); i++) {
                st+=temp.get(i);
            }
            list.add(st);
            return;
        }
        getSubsequence2(s,idx+1,temp);
        temp.add(s[idx]);
        getSubsequence2(s,idx+1,temp);
        temp.remove(temp.size()-1);

        
    }
}
