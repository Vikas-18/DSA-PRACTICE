import java.util.ArrayList;
import java.util.LinkedHashMap;

public class containsDuplicate2 {
    public static void main(String[] args) {
        int[]nums = {-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();//gives the order map facility
       
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]) && map.get(nums[i])==1)
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for(int num: map.keySet())
        {
            while(map.get(num)!=0)
            {
                temp.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        for(int i=0; i<temp.size(); i++)
        {
            nums[i] = temp.get(i);
        }
        return temp.size();
      
        
    }
}
