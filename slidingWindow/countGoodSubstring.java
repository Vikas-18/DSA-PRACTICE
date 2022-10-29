import java.util.HashSet;

public class countGoodSubstring {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
    }

    public static int countGoodSubstrings(String s) {
        int i=0; 
        int j=0;
     
        int ans=0;
        while(j<s.length())
        {
            if(j-i+1<3)
            {
                j++;
            }
            else if(j-i+1==3)
            {
                HashSet<Character> set  = new HashSet<>();
                for(int idx=i; idx<=j; idx++)
                {
                    set.add(s.charAt(idx));
                }
                if(set.size()==3)
                {
                    ans++;
                    set.clear();
                }
               i++;
               j++;
            }
        }
        return ans;
    }
}
