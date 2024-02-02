import java.util.HashMap;
import java.util.ArrayList;

public class winnersLosers {
    public static void main(String[] args) {
        int[][] matches = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
                { 10, 9 } };
        System.out.println(findWinners(matches));
    }

    public static ArrayList<ArrayList<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];

            if (map2.containsKey(loser)) {
                map2.put(loser, map2.get(loser) + 1);
            } else {
                map2.put(loser, 1);
            }
            map1.put(winner, 1);
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (Integer key : map2.keySet()) {
            if (map2.get(key) == 1) {
                list2.add(key);
            }
            if (map1.containsKey(key)) {
                map1.remove(key);
            }
        }
        for (Integer key : map1.keySet()) {

            list1.add(key);

        }
        ans.add(new ArrayList<>(list1));
        ans.add(new ArrayList<>(list2));

        return ans;
    }
}
