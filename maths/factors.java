import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        System.out.println(solve(54));
    }

    public static ArrayList<Integer> solve(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
}
