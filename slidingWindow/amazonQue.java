import java.util.HashMap;

public class amazonQue {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 3, 5 };
        System.out.println(solve(arr, 3));
    }

    public static int solve(int[] arr, int k) {
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        while (j < arr.length) {
            if (map.containsKey(arr[j])) {
                int oldf = map.get(arr[j]);
                int newf = oldf + 1;
                map.put(arr[j], newf);
            }

            else {
                map.put(arr[j], 1);
            }

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    if (map.get(arr[l]) > 1) {
                        break;
                    } else if (map.get(arr[l]) == 1) {
                        sum += arr[l];
                    }

                    if (l == j) {
                        ans = Math.max(ans, sum);
                    }
                }

                if (map.containsKey(arr[i])) {
                    int oldf = map.get(arr[i]);
                    int newf = oldf - 1;
                    map.put(arr[i], newf);
                }

                else {
                    map.put(arr[i], 0);
                }
                i++;
                j++;
            }

        }

        return ans;
    }
}
