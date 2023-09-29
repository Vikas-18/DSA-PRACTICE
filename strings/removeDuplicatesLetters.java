import java.util.Arrays;
import java.util.HashMap;

public class removeDuplicatesLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("bcabc"));
    }

    public static String removeDuplicateLetters(String s) {
        String ans = "";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i))>1)
            {
                ans+=s.charAt(i);
                map.put(s.charAt(i),0);
            }
            else
            {
                ans+=s.charAt(i);
            }
        }
        char[] arr = ans.toCharArray();
        Arrays.sort(arr);
        ans="";
        for(int i=0; i<arr.length; i++)
        {
            ans+=arr[i];
        }
        return ans;
    }
}
