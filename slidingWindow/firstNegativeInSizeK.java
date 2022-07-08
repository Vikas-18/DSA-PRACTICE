import java.util.ArrayList;

public class firstNegativeInSizeK {
    public static void main(String[] args) {
        int[]arr = {1,2,-4,5,-7,8,4,6};
        int k=3;
        int i=0;
        int j=0;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        

        while(j<arr.length)
        {
          
          if(j-i+1<k)
           {//12 -1 -7  8 -15 20 16 27
                if(arr[j]<0)
                {    
                  list.add(arr[j]);
                }
                j++;
           }

          else if(j-i+1==k)
           {
                if(arr[j]<0)
                {    
                 list.add(arr[j]);
                }
                if(list.size()>0)
                {
                    ans.add(list.get(0));
                }
                if(list.size()>0 && arr[i]==list.get(0))
                {
                    list.remove(list.get(0));
                }
                else if(list.size()==0){
                    list.add(0);
                    ans.add(list.get(0));
                }
                i++;
                j++;
           }
        }
        System.out.println(ans);

    }
}
