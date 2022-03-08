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
       arr1.add(1);
       arr1.add(2);
     
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(-1);
        arr2.add(2);
        
    
        merge(arr1, arr2);
        System.out.println(arr1);
       

      
        
        
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
        arr1.clear();
         for(int k=0; k<arr.size(); k++)
        {
            arr1.add(k, arr.get(k)); 
        }
    }
}