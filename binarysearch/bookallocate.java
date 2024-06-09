import java.util.ArrayList;

public class bookallocate {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 67, 90 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            list.add(arr[index]);
        }
        int n = 4;
        int m = 2;
        System.out.println(findPages(list, n, m));
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int s = max(arr, n);
        int e = sum(arr, n);
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            boolean allocation = allocate(arr, n, mid, m);
            if (allocation) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static int max(ArrayList<Integer> list, int n) {
        int ans = -1;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, list.get(i));
        }
        return ans;
    }

    public static int sum(ArrayList<Integer> list, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static boolean allocate(ArrayList<Integer> list, int n, int pages, int m) {
        int ans = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list.get(i);
            if (sum > pages) {
                ans++;
                sum = list.get(i);
            }
        }
        return ans == m;
    }
}
