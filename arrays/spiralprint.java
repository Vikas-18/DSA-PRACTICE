import java.util.ArrayList;

public class spiralprint {
    public static void main(String[] args) {

    }

    public static void solve(int[][] arr) {
        int a = 0;
        int b = arr[0].length - 1;
        int c = arr.length - 1;
        int d = arr[0].length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int tce = arr.length * arr[0].length;

        int cnt = 0;
        while (tce < cnt) {
            // right
            while (tce < cnt) {

                for (int i = a; i <= b; i++) {
                    cnt++;
                    list.add(arr[a][i]);
                }
                a++;

            }
        }
    }
}
