import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
//idea was that use BFS and check for each char in each place from a to z and instead of using visited using the set and removing the word from the set if it is visited
public class wordLadder {
    public static void main(String[] args) {
        
    }
    class Solution {
        class Pair
        {
            String str;
            int len;
            Pair(String str,int len)
            {
                this.str = str;
                this.len = len;
            }
        }
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> set = new HashSet<>();
            for(int i=0; i<wordList.size(); i++)
            {
                set.add(wordList.get(i));
            }
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(beginWord,1));
            set.remove(beginWord);
    
            while(q.size()>0)
            {
                String str = q.peek().str;
                int len = q.peek().len;
                q.remove();
                if(str.equals(endWord))
                {
                    return len;
                }
    
                for(int i=0; i<str.length(); i++)
                {
                    for(char ch='a'; ch<='z'; ch++)
                    {
                        char[] tempstr =  str.toCharArray();
                        tempstr[i] = ch;
                        String newstr = new String(tempstr);
                        if(set.contains(newstr))
                        {
                            q.add(new Pair(newstr,len+1));
                            set.remove(newstr);
                        }
                    }
                }
            }
    
            return 0;
        }
    }
}
