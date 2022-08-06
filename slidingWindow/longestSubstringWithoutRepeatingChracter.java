import java.util.HashMap;

public class longestSubstringWithoutRepeatingChracter {
    public static void main(String[] args) {
        String s = "eeydgwdykpv";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        
        int i=0;
        int j=0;
        HashMap<Character,Integer> map  = new HashMap<>();
        int ans = 0;
        while(j<s.length())
        {
            //calculations
            if(map.containsKey(s.charAt(j)))
            {
                int oldf = map.get(s.charAt(j));
                int newf = oldf+1;
                map.put(s.charAt(j),newf);
            }
            else {
                map.put(s.charAt(j),1);
            }
            
            if(map.size()==j-i+1)
            {
                ans = Math.max(ans,j-i+1);
                j++;
            }
            
            else if(map.size()<j-i+1)
            {
                while(map.size()<j-i+1)
                {
                    if(map.containsKey(s.charAt(i)))
                    {
                        int oldf = map.get(s.charAt(i));
                        int newf = oldf-1;
                        map.put(s.charAt(i),newf);
                        if(map.get(s.charAt(i))==0)
                        {
                            map.remove(s.charAt(i));
                        }
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
