import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
           
            if(map.containsKey(s.charAt(i)))
            {
                int oldfrq = map.get(s.charAt(i));
                int newfrq = oldfrq+1;
                map.put(s.charAt(i),newfrq);
            }
            else
            {
                map.put(s.charAt(i),+1);
            }
        }
        
        for(int i=0; i<t.length(); i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                int oldfrq = map.get(t.charAt(i));
                int newfrq = oldfrq-1;
                map.put(t.charAt(i),newfrq);
            }
            
        }
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i))!=0)
            {
                return false;
            }
        }
        return true;
    }
}
