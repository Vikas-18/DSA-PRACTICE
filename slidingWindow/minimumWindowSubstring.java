import java.util.HashMap;

public class minimumWindowSubstring {
    public static void main(String[] args) {
        String  s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        
        int i=0;
        int j=0;
        int[]index = new int[2];
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(i=0; i<t.length(); i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }
            
            else {
                map.put(t.charAt(i),1);
            }
        }
        
        int count = map.size();
        int ans = 100000;
        while(j<s.length())
        {
            if(map.containsKey(s.charAt(j)))
            {
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))<=0)
                {
                    count--;
                }
              
            }
            
            if(count<=0)
            {
                
                while(count<0)
                {
                    if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))<0)
                    {
                         if(map.containsKey(s.charAt(i)))
                        {
                            map.put(s.charAt(i),map.get(s.charAt(i))+1);
                        }
            
                        else 
                        {
                            map.put(s.charAt(i),1);
                        }
                        if(map.get(s.charAt(i))>0)
                        {
                            count++;
                        }
                    }
                    i++;
                }
                ans = Math.min(ans,j-i+1);
                if(j-i+1<=ans)
                {
                    index[0] = i;
                    index[1] = j;
                }
       
            }
            j++; 
        }
        String res = "";
        for(int temp = i; temp<j; temp++)
        {
            res+=s.charAt(temp);
        }
        return res;
    }
}
