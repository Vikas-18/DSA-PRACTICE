import java.util.LinkedList;
import java.util.Queue;

public class streamCharacter {
    public static void main(String[] args) {
        
    }
    public String solve(String A) {
        int[] frq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<A.length(); i++)
        {
            q.add(A.charAt(i));
            frq[A.charAt(i)-'a']++;
            while(q.size()>0 && frq[q.peek()-'a']>1)
            {
                q.remove();
            }
            if(q.isEmpty())
            {
                ans.append("#");
            }
            else
            {
                ans.append(q.peek());
            }
        }
        return ans.toString();
    }
}
