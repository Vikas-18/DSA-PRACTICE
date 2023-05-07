import java.util.HashMap;

public class vowels {
    public static void main(String[] args) {
        String  s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
    static public int maxVowels(String s, int k) {
        int max = 0;
        int cnt = 0;
        int i=0; 
        int j=0;
        int n = s.length();
        HashMap<Character,Integer> map  = new HashMap<>();
        String vowels = "aeiou";
        for(i=0; i<vowels.length(); i++)
        {
            map.put(vowels.charAt(i),1);
        }
        i=0;
        while(j<n)
        {
            if(map.containsKey(s.charAt(j)))
            cnt++;

            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                max = Math.max(cnt,max);
                if(map.containsKey(s.charAt(i)))
                {
                    cnt--;
                }
                i++;
                j++;
            }
        }
        return max;
    }
}
