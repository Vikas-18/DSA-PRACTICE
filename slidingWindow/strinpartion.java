import java.util.HashMap;

/**
 * strinpartion
 */
public class strinpartion {

    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }
    public static int partitionString(String s) {
        int ans = 1;
        int i=0;
        int j=0;
       HashMap<Character,Integer> map = new HashMap<>();

        while(j<s.length())
        {
          if(map.containsKey(s.charAt(j)))
          {
            map.put(s.charAt(j),map.get(s.charAt(j))+1);
          }
          else
          {
            map.put(s.charAt(j),1);
          }
          if(j-i+1>map.size())
          {
              while(map.size()!=j-i+1)
              {
                 if(map.get(s.charAt(i))==0)
                 {
                     map.remove(s.charAt(i));
                 }
                 else
                 {
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                 }
                 if(map.get(s.charAt(i))==0)
                 {
                     map.remove(s.charAt(i));
                 }
                 i++;
              }
              ans++;
          }
          j++;
        }
        return ans;
    }
}