import java.util.HashMap;

public class reverseunique {
    public static void main(String[] args) {
        System.out.println(reverseString("GEEKS FOR GEEKS"));
    }

    public static String reverseString(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' && map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                map.put(s.charAt(i),1);
            }
        }
        String ans = "";

        for(int i=s.length()-1; i>=0; i--)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' &&  map.get(s.charAt(i))==1)
            {
                ans+=s.charAt(i);
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z' && map.get(s.charAt(i))>1 )
            {
                ans+=s.charAt(i);
                map.put(s.charAt(i),0);
            }
        }
        return ans;
    }
}
