import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class goatLatin {
    public static void main(String[] args) {
        String sentence ="I speak Goat Latin";
        System.out.println(toGoatLatin(sentence));
    }
    public static String toGoatLatin(String sentence) {
        
        Queue<String> q = new LinkedList<>();
        String word = "";
        for(int i=0; i<sentence.length(); i++)
        {
            if(sentence.charAt(i)!=32)
            {
                word+=sentence.charAt(i);
                if(i==sentence.length()-1)
                {
                    q.add(word);
                }
            }
            else
            {
                
                q.add(word);
                word="";
            }
        }
        HashMap<Character,Integer> map = new HashMap<>();
        String vowels = "aeiouAEIOU";
        for(int i=0; i<vowels.length(); i++)
        {
            map.put(vowels.charAt(i),1);
        }
        int cnt = 0;
        String ans = "";
        while(q.size()>0)
        {
            word = q.peek();
            q.remove();
            cnt++;
            if(map.containsKey(word.charAt(0)))
            {
                word+="ma";
                for(int i=0; i<cnt; i++)
                {
                    word+="a";
                }

                if(cnt==1)
                {
                    ans = ans + word;
                }
                else
                {
                    ans = ans + " " + word;
                }
                
            }
            else
            {
    
               String temp = "";
               for(int i=1; i<word.length(); i++)
               {
                   temp+=word.charAt(i);
               } 
               temp+=word.charAt(0);
               temp+="ma";

               for(int i=0; i<cnt; i++)
                {
                    temp+="a";
                }
                if(cnt==1)
                {
                    ans = ans + temp;
                }
                else
                {
                    ans = ans + " " + temp;
                }
                
            }
        }
        return ans;
    }
}
