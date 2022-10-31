import java.util.ArrayList;

public class pascal {
    public static void main(String[] args) {
        System.out.println(generate2(5));
    }

    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<numRows; i++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++)
            {
                if(j==0 || j==i)
                {
                    list.add(1);
                }
                else
                {
                    list.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> generate2(int numRows) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i=1; i<=numRows; i++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<i; j++)
            {
                if(j==0 || j==i-1)
                {
                    list.add(1);
                }
                else
                {
                    list.add(ans.get(i-1-1).get(j-1)+ans.get(i-1-1).get(j));
                }
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}
