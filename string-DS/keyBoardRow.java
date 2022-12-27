import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
public class keyBoardRow {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
    public static String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++)
        {
            map.put(s1.charAt(i),1);
        }
        for(int i=0; i<s2.length(); i++)
        {
            map.put(s2.charAt(i),2);
        }
        for(int i=0; i<s3.length(); i++)
        {
            map.put(s3.charAt(i),3);
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++)
        {
            String word = words[i].toLowerCase();
            if(inRow(map,word))
            {
                list.add(words[i]);
            }
        }
        String[]ans = new String[list.size()];
        for(int i=0; i<ans.length; i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static boolean inRow(HashMap<Character,Integer> map,String s)
    {
       int check = map.get(s.charAt(0));
       for(int i=1; i<s.length(); i++)
       {
           if(map.get(s.charAt(i))!=check)
           {
               return false;
           }
       }
       return true;
    }
}
