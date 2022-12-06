import java.util.ArrayList;
public class customclasses {
    public static class Pair{
        int val;
        int index;
        Pair(int val,int index)
        {
            this.val = val;
            this.index = index;
        }
    }
    public static void main(String[] args) {
       ArrayList<Pair> arr = new ArrayList<>();
       arr.add(new Pair(1, 3));
       arr.add(new Pair(2, 2));
       arr.add(new Pair(7, 5));
       for (int i = 0; i <arr.size(); i++) {
          System.out.println(arr.get(i).val + "->" + arr.get(i).index );
       }
    }
}
