import java.util.HashMap;
import java.util.ArrayList;

public class countrowcolsame {
    public static void main(String[] args) {
        int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
        System.out.println(equalPairs(grid));

    }

    public static int equalPairs(int[][] grid) {
        int ans = 0;
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                list.add(grid[i][j]);
            }
            if (map.containsKey(list)) {
                map.put(list, map.get(list) + 1);
            } else
                map.put(list, 1);
        }
        for (int j = 0; j < grid[0].length; j++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                list.add(grid[i][j]);
            }
            if (map.containsKey(list)) {
                ans = map.get(list);
            }
        }
        return ans;
    }
}
