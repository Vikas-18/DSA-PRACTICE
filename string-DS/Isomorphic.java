import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("baba", "badc"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(check(s,t)==true && check(t,s)==true)
        {
            return true;
        }
  
        return false;
          
      }

    public static boolean check(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();

        int i=0;
        int j=0;

        while(i!=s.length())
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))!=t.charAt(j))
                {
                    return false;
                }
            }
            map.put(s.charAt(i),t.charAt(j));
            i++;
            j++;
        }

        return true; 
    }
    
}