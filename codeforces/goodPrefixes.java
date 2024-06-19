import java.util.HashMap;
import java.util.Scanner;

public class goodPrefixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of elements in the array
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }
            System.out.println(countGoodPrefixes(array));
        }

        scanner.close();
    }

    private static int countGoodPrefixes(int[] array) {
        int res = 0;

        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            map.put(sum, i);
            if (map.containsKey(sum - array[i]))
                res++;
        }
        return res;
    }
}
