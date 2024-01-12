public class waterneeded {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 5 };
        System.out.println(minimumRefill(arr, 6, 5));
    }

    public static int minimumRefill(int[] plants, int a, int b) {
        int ia = a;
        int ib = b;
        int ans = 0;

        int i = 0;
        int j = plants.length - 1;

        while (i <= j) {
            if (i != j && a >= plants[i] && b >= plants[j]) {
                a -= plants[i];
                b -= plants[j];
                i++;
                j--;
            } else if (i != j && a < plants[i] && b >= plants[j]) {
                a = ia;
                a -= plants[i];
                b -= plants[j];
                ans++;
                i++;
                j--;
            } else if (i != j && a >= plants[i] && b < plants[j]) {
                b = ib;
                a -= plants[i];
                b -= plants[j];
                ans++;
                i++;
                j--;
            } else if (i != j && a < plants[i] && b < plants[j]) {
                b = ib;
                a = ia;
                a -= plants[i];
                b -= plants[j];
                ans += 2;
                i++;
                j--;
            } else if (i == j && a >= plants[i] || b >= plants[i]) {
                i++;
                j--;
            } else {
                ans++;
                i++;
                j--;
            }

        }
        return ans;

    }
}
