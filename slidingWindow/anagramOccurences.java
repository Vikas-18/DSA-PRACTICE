import java.util.HashMap;

public class anagramOccurences {
    public static void main(String[] args) {
        String s1 = "123212321";
        String s2 = "123";
        System.out.println(solve(s1, s2));
    }

    public static int countanagram(String s1, String s2)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {

            if(map.containsKey(s2.charAt(i)))
            {
                int oldfrq = map.get(s2.charAt(i));
                int newfrq = oldfrq+1;
                map.put(s2.charAt(i), newfrq);
            }
            else
            map.put(s2.charAt(i), 1);
        } 
        //aabbacbbabaab
        //aab
        int i=0;
        int j=0;
        int k = s2.length();
        int ans = 0;
        int count = map.size();
        while(j<s1.length())
        {
            //calculation
              if(map.containsKey(s1.charAt(j)))
              {
                    int oldfrq = map.get(s1.charAt(j));
                    int newfrq = oldfrq-1;
                    map.put(s1.charAt(j), newfrq);
                    if(map.get(s1.charAt(j))==0)
                    {
                        count--;
                    }
              }
              
              if(j-i+1<k)
              {
                j++;
              }

             else if(j-i+1==k)
              {
                 if(count==0)
                 {
                    ans++;
                 }
                 //removing the i calculation to slide the window
                 if(map.containsKey(s1.charAt(i)))
                 {
                    int oldfrq = map.get(s1.charAt(i));
                    int newfrq = oldfrq+1;
                    map.put(s1.charAt(i), newfrq);
                    if(map.get(s1.charAt(i))==1)
                    {
                        count++;
                    }
                 }
                 i++;
                 j++;

              }
        }

        return ans;
    }

    public static int solve(String s1,String s2)
    {
        int i=0;
        int j=0;
        int ans = 0;
        int k=s2.length();
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<s1.length())
        {
            if(j-i+1<=k)
            {
                if(map.containsKey(s1.charAt(j)))
                {
                    int oldf = map.get(s1.charAt(j));
                    int newf = oldf+1;
                    map.put(s1.charAt(j), newf);
                }
                else{
                    map.put(s1.charAt(j), 1);
                }
                j++;
            }

            else if(j-i+1>k)
            {
                int temp=0;
                for (int l = 0; l <map.size(); l++) 
                {
                    if(map.containsKey(s2.charAt(l)))
                    {
                        temp++;
                    }
                }
                if(temp==k)
                {
                    ans++;
                }

                map.remove(s1.charAt(i));
                i++;
                j++;
            }
        }
        return ans;
    }
}
