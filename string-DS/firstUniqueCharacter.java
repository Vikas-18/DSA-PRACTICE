import java.util.*;

public class firstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetlcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            
            if(map.containsKey(s.charAt(i)))
            {
                int oldfrq = map.get(s.charAt(i));
                int newfrq = oldfrq + 1;
                map.put(s.charAt(i),newfrq);
            }
            else
            map.put(s.charAt(i),1);
        }
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}
