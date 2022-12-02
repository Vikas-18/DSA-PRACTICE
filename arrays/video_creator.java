import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class video_creator {
    public static void main(String[] args) {
       String[] creators = {"alice","bob","alice","chris"}, ids = {"one","two","three","four"};
       int[] views = {5,10,5,4};
       System.out.println(mostPopularCreator(creators, ids, views));
    }

    public static ArrayList<ArrayList<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<creators.length; i++)
        {
            if(map.containsKey(creators[i]))
            {
                map.put(creators[i],map.get(creators[i])+views[i]);
            }
            else{
                map.put(creators[i],views[i]);
            }
        }

        HashMap<String,String> map2  = new HashMap<>();
        for(int i=0; i<creators.length; i++)
        {
            if(map2.containsKey(creators[i]) )
            {
                if(map2.get(creators[i]).compareTo(ids[i])>0)
                {
                    map2.put(creators[i],ids[i]);
                }
                else
                {
                    continue;
                }
            }
            else
            {
                map2.put(creators[i],ids[i]);
            }
        }
      
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        int temp = 0;
        for(Map.Entry<String,Integer> m: map.entrySet())
        {
           temp = Math.max(temp,m.getValue());
        }
        for(Map.Entry<String,Integer> m: map.entrySet())
        {
            ArrayList<String> list  = new ArrayList<>();
          if(m.getValue()==temp)
          {
            list.add(m.getKey());
            list.add(map2.get(m.getKey()));
            ans.add(new ArrayList<>(list));
          }
        }
        return ans;
    }
}
