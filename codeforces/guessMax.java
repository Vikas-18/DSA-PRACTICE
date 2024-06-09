import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class guessMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(arr, n));
        }
    }

    public static int solve(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 1;
        while (j < n) {
            int max = Math.max(arr[i], arr[j]);
            list.add(max);
            i++;
            j++;
        }
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < list.size(); k++) {
            min = Math.min(min, list.get(k));
        }
        return min - 1;
    }
}
