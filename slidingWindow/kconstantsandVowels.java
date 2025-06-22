import java.util.HashMap;

public class kconstantsandVowels {
    public static void main(String[]args)
    {

        String word = "aeioqq";
        System.out.println(countOfSubstrings(word, 1));
    }
     public static  long countOfSubstrings(String word, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        long ans = 0;
        int i=0;
        int j=0;
        int cnt=0;
        while(j<word.length())
        {
            if(isVowel(word.charAt(j)))
            {
                map.put(word.charAt(j),map.getOrDefault(word.charAt(j),0)+1);
            }
            else
            {
                cnt++;
            }

            if(cnt<k)
            {
                j++;
            }
            else if(cnt==k)
            {
                if(map.size()==5)
                {
                    ans++;
                }
                j++;
            }
            else
            {
                while(cnt>k)
                {
                    if(isVowel(word.charAt(i))){
                        map.put(word.charAt(i),map.get(word.charAt(i))-1);
                        if(map.get(word.charAt(i))==0)
                        {
                            map.remove(word.charAt(i));
                        }
                    }
                    else{
                        cnt--;
                    }
                    i++;
                }
                if(cnt==k)
                {
                    if(map.size()==5)
                    {
                        ans++;
                    }
                    j++;
                }

            }
        }
        return ans;
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
