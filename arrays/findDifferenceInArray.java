import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class findDifferenceInArray {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3};
        int[]arr2 = {2,4,6};
        System.out.println(findDifference(arr1, arr2));
    }
    public static ArrayList<ArrayList<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++)
        {
            map.put(nums1[i],1);
        }
        for(int i=0; i<nums2.length; i++)
        {
           if(!map.containsKey(nums2[i]))
           {
               list.get(1).add(nums2[i]);
           }
           else{
            map.remove(nums2[i]);
           }
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet())
        {
            list.get(0).add(m.getKey());
        }
        return list;
    }
}
