package maths;

import java.util.ArrayList;
import java.util.*;

/**
 * mergeandmedian
 */
public class mergeandmedian {

    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
       //[1,2,3] [4,5,6]
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        
    
        merge(arr1, arr2);
        System.out.println(arr);
         Double obj = Double.valueOf(arr.get(0));

        if(arr.size()==1)
        {
            System.out.println(obj);
        }
        
        
    }
    static  List<Integer> arr = new ArrayList<>();
     static void merge(List<Integer> arr1 , List<Integer> arr2)
    {
       
        int i=0;
        int j=0;
        
        while(i<arr1.size() && j<arr2.size())
        {
            if(arr1.get(i)>arr2.get(j))
            {
                arr.add(arr2.get(j));
                j++;

            }
            else{
                 arr.add(arr1.get(i));
                 i++;
            }

        }
        while(i<arr1.size())
        {
            arr.add(arr1.get(i));
            i++;
        }
         while(j<arr2.size())
        {
            arr.add(arr2.get(j));
            j++;
        }
    }
}