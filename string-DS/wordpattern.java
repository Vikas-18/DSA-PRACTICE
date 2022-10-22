import java.util.ArrayList;
import java.util.HashMap;

public class wordpattern {
    public static void main(String[] args) {
       System.out.println(iswrodPattern2("abba", "dog dog dog dog"));

    }

    public static boolean iswrodPattern(String pattern,String s)
    {
        char[] arr = s.toCharArray();
        ArrayList<String> words = new ArrayList<>();
        HashMap<Character,String> map = new HashMap<>();
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            word+=arr[i];
            if(arr[i]==32 || i==arr.length-1)
            {
              
                words.add(word.trim());
                word = "";
            }
        }
        if(pattern.length()!=words.size())
        {
            return false;
        }
        for (int i = 0; i <words.size(); i++) {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(map.get(pattern.charAt(i)).equals(words.get(i))==false)
                {
                    return false;
                }
            }
            map.put(pattern.charAt(i),words.get(i));
        }
        return true;
        
    }
    public static boolean iswrodPattern2(String pattern,String s)
    {
        char[] arr = s.toCharArray();
        ArrayList<String> words = new ArrayList<>();
        HashMap<String,Character> map = new HashMap<>();
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            word+=arr[i];
            if(arr[i]==32 || i==arr.length-1)
            {
                
                words.add(word.trim());
                word = "";
            }
        }
        if(pattern.length()!=words.size())
        {
            return false;
        }
        for (int i = 0; i <words.size(); i++) {
            if(map.containsKey(words.get(i)))
            {
                if(map.get(words.get(i))!=pattern.charAt(i))
                {
                    return false;
                }
            }
            map.put(words.get(i),pattern.charAt(i));
        }
        return true;
        
    }
}
