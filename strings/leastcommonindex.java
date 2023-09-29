import java.util.ArrayList;
import java.util.Arrays;

public class leastcommonindex {
    public static void main(String[] args) {
        String[]list1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        String[]list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        int sum = (int)1e9;
        ArrayList<Integer> index = new ArrayList<>();
       

        for(int i=0; i<list1.length;i++)
        {
            for(int j=0; j<list2.length; j++)
            {
                if(list1[i].equals(list2[j]))
                {
                  sum = Math.min(sum,i+j);
                }
            }
        }
         for(int i=0; i<list1.length;i++)
        {
            for(int j=0; j<list2.length; j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    if(i+j<=sum)
                    {
                        index.add(i);
                    }
                }
            }
        }
        String[] ans = new String[index.size()];
        for(int i=0; i<index.size(); i++)
        {
            ans[i]  = list1[index.get(i)];
        }
        return ans;
    }
}
