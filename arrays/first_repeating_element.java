package arrays;

import java.util.*;
public class first_repeating_element {
    public static void main(String[] args) {
        int[]arr = { 6, 10, 5, 4, 9, 120};
        System.out.println(solve(arr));
    }
    public static  int solve(int[] A) {
        
        HashMap<Integer,Integer> map  = new HashMap<>();
        
       for(int i=0; i<A.length; i++)
        {
            if(map.containsKey(A[i]))
            {
                int oldfrq = map.get(A[i]);
                int newfrq = oldfrq+1;
                map.put(A[i],newfrq);
            }
            else
            map.put(A[i],1);
        }
        
        for(int i=0; i<A.length; i++)
        {
            if(map.containsKey(A[i]) && map.get(A[i])>=2)
            {
                return A[i];
            }
        }
        return -1;
    }
}
