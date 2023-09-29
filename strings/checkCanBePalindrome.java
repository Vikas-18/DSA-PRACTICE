
import java.util.*;
public class checkCanBePalindrome {
    public static void main(String[] args) {
        String s = "yzfbzbyyrurquqf";//y-3 z-2 f-2 b-2 r-2 u-2 q-2
        System.out.println(solve(s));
    }
    public static int solve(String A) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<A.length(); i++)
        {
            if(map.containsKey(A.charAt(i)))
            {
                int oldfrq = map.get(A.charAt(i));
                int newfrq = oldfrq+1;
                map.put(A.charAt(i),newfrq);
            }
            else{
                map.put(A.charAt(i),1);
            }
        }
        
        int oddfrq = 0;
        int evenfrq = 0;
     for(Integer val:map.values())//iteration over value set
     {
        if(val%2==0)
        {
           evenfrq++;
        }
        else{
            oddfrq++;
        }
     }

     if(oddfrq>1)
     {
        return 0;
     }
        return 1;
    }
}
