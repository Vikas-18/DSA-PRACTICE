import java.util.ArrayList;
import java.util.Collections;
public class lastStonesWeight {
    public static void main(String[] args) {
        int[]stones = {2,2};
        System.out.println(lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<stones.length; i++)
        {
            list.add(stones[i]);
        }
        Collections.sort(list);
        while(list.size()>0)
        {
            if(list.size()==1)
            {
                return list.get(0);
            }
            int x = list.get(list.size()-1);
            int y = list.get(list.size()-2);
            if(x==y)
            {
                list.remove(list.get(list.size()-1));
                list.remove(list.get(list.size()-1));
            }
            else
            {
                list.remove(list.get(list.size()-1));
                list.remove(list.get(list.size()-1));
                int newentry = Math.abs(x-y);
                list.add(newentry);
                Collections.sort(list);
            }
        }
        return 0;
    }
}
