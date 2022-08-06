import java.util.HashMap;

public class pickToys {
    public static void main(String[] args) {
        String s = "abaccab";
        System.out.println(solve(s));
    }

    public static int solve(String s)
    {
        int i=0;
        int j=0;
        int k=2;
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = -1;
        while(j<s.length())
        {
             if(map.containsKey(s.charAt(j)))
             {
                int oldf = map.get(s.charAt(j));
                int newf = oldf+1;
                map.put(s.charAt(j),newf);
             }

             else{
                map.put(s.charAt(j),1);
             }

             if(map.size()<2)
             {
                j++;
             }

             if(map.size()==2)
             {
               ans = Math.max(ans, j-i+1);
               j++;
             }

             else if(map.size()>2)
             {
                while(map.size()>2)
                {
                    if(map.containsKey(s.charAt(i)))
                    {
                       int oldf = map.get(s.charAt(i));
                       int newf = oldf-1;
                       map.put(s.charAt(i),newf);
                    }
       
                    else if(map.get(s.charAt(i))==1)
                    {
                       map.remove(s.charAt(i));
                    }
                }
                i++;

             }
        }
        return ans;
    }
}
