
import java.util.ArrayList;
import java.util.HashMap;
public class removeduplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr  = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(ArrayList<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
      for (int i = 0; i < nums.size(); i++) {
           
            if(map.containsKey(nums.get(i)))
            {
                int oldfrequency = map.get(nums.get(i));
                int newfrequency = oldfrequency + 1;
                map.put(nums.get(i), newfrequency);
            }
            else{
                map.put(nums.get(i), 1);
            }
      }

      for (int i = 0; i < nums.size(); i++) {
        if(map.get(nums.get(i))==1)
        {
            return nums.get(i);
        }
      }
      return -1;


     }
}
