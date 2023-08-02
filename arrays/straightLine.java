import java.util.HashMap;

public class straightLine {
    public static void main(String[] args) {
        // int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, {
        // 6, 7 } };
    }

    public boolean checkStraightLine(int[][] coordinates) {
        HashMap<Double, Integer> map = new HashMap<>();
        int n = coordinates.length;
        int m = coordinates[0].length;
        int i = 0;
        int j = 1;
        while (j < n) {
            int x1 = coordinates[i][0];
            int y1 = coordinates[i][1];
            int x2 = coordinates[j][0];
            int y2 = coordinates[j][1];
            double slope = 0;
            if (x2 - x1 == 0) {
                slope = Integer.MAX_VALUE;
            }
            if (y2 - y1 == 0) {
                slope = 0;
            }
            slope = ((double) (y2 - y1) / (double) (x2 - x1));
            if (map.containsKey(slope)) {
                map.put(slope, map.get(slope) + 1);
            } else {
                map.put(slope, 1);
            }
            i++;
            j++;
        }
        if (map.size() == 1) {
            return true;
        }
        return false;

    }
}
