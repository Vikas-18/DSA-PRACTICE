import java.util.ArrayList;

/**
 * sequentialDigits
 */
public class sequentialDigits {

    public static void main(String[] args) {
        System.out.println(sequentialDigits(1000, 13000));
    }

    public static ArrayList<Integer> sequentialDigits(int low, int high) {

        for (int i = 1; i <= 9; i++) {
            StringBuilder s = new StringBuilder();
            s.append(i);
            solve(low, high, i, s);
        }
        return list;
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static void solve(int low, int high, int num, StringBuilder s) {

        if (Integer.parseInt(s.toString()) > high) {
            return;
        }
        if (low <= Integer.parseInt(s.toString()) && Integer.parseInt(s.toString()) <= high) {
            list.add(Integer.parseInt(s.toString()));

        }
        if (num + 1 >= 10) {
            return;
        }
        s.append(Integer.toString(num + 1));
        solve(low, high, num + 1, s);

    }
}