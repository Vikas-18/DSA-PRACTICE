
/**
 * salesforce
 */
import java.util.ArrayList;

public class salesforce {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(12);
        list.add(3);
        list.add(7);
        System.out.println(solve(list, 5));
    }

    public static int solve(ArrayList<Integer> list, int t) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int range = list.get(i);
            for (int j = i; j < list.size(); j++) {
                range = range & list.get(j);
                ans = Math.min(ans, Math.abs(range - t));
            }
        }
        return ans;
    }
}