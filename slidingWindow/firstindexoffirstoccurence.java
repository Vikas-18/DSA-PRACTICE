import java.util.HashMap;

public class firstindexoffirstoccurence {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issip"));
    }
    public static int strStr(String s, String t) {
        
      
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<t.length(); i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }
            else
            {
                map.put(t.charAt(i),1);
            }
        }
          
        int cnt = t.length();
        int i=0; 
        int j=0;
        int k=t.length();
        int ans=-1;
        while(j<s.length())
        {
             if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j))>0)
            {
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                  cnt--;
            }
            
            if(j-i+1<k)
            {
                j++;
            }
            else
            {
                if(cnt==0)
                {
                    ans=i;
                }
                 if(map.containsKey(s.charAt(i)))
                {
                   map.put(s.charAt(i),map.get(s.charAt(i))+1);
                   cnt++;
                    if(cnt==0)
                    {
                        ans=i;
                    }
                }
            
                i++;
                j++;
            }
        }
        return ans;
    }
}
