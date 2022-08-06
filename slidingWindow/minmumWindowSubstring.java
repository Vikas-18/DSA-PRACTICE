
import java.util.*;
public class minmumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static int minWindow(String s, String t) {
        
        int i=0;
        int j=0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i2=0; i2<t.length(); i2++)
        {
            if(map.containsKey(t.charAt(i2)))
            {
                map.put(t.charAt(i2),map.get(t.charAt(i2))+1);
            }
            
            else {
                map.put(t.charAt(i2),1);
            }
        }
        
        int count = map.size();
        int ans = 100000;
        while(j<s.length())
        {
            if(map.containsKey(s.charAt(j)))
            {
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0)
                {
                    count--;
                }
                
            }
            
            if(count==0)
            {
                if(!map.containsKey(s.charAt(i)))
                {
                    i++;
                }
                else if(map.containsKey(s.charAt(i)))
                {
                    if(map.get(s.charAt(i))<0)
                    {
                        map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    }
                    if(map.get(s.charAt(i))==1)
                    {
                        count++;
                    }
                    i++;
                    
                    ans = Math.min(ans,j-i+1);

                }
                
                
                
            } 
            j++;
        }
        
        return ans;
        
    }
}
