import java.util.ArrayList;
import java.util.HashMap;

public class oddstringleetcode {
    public static void main(String[] args) {
        String words[]  ={"aaa","bob","ccc","ddd"};
        System.out.println(oddString(words));
    }
    public static String oddString(String[] words) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<ArrayList<Integer>,String> map  = new HashMap<>();
        String ans = "";
        for(int i=0; i<words.length; i++)
        {
            int ptr1 =0;
            int ptr2 = ptr1+1;
            String s = words[i];
            ArrayList<Integer> arr = new ArrayList<>();
            while(ptr2<s.length())
            {
                arr.add(s.charAt(ptr2)-s.charAt(ptr1));
                ptr1++;
                ptr2++;
            }
            if(map.containsKey(arr))
            {
                ans = s;
            }
                map.put(list,s);
            
        }
        for(String m: map.values())
        {
            if(m.equals(ans)==false)
            {
                return m;
            }
        }
        return words[0];
    }
}
