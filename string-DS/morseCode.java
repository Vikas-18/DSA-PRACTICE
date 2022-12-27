import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class morseCode {
    public static void main(String[] args) {
        
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0; i<alphabets.length(); i++)
        {
            map.put(alphabets.charAt(i),morse[i]);
        }
        Set<String> set = new HashSet<>();
        for(int i=0; i<words.length; i++)
        {
            String word = words[i];
            String temp = "";
            for(int idx=0; idx<word.length(); idx++)
            {
               temp+=map.get(word.charAt(idx));
            }
            set.add(temp);
        }
        return set.size();
    }
}
