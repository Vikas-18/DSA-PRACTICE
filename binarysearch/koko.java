
public class koko {
    public static void main(String[] args) {
        int[] pile = { 3, 6, 7, 11 };
        System.out.println(minEatingSpeed(pile, 8));

    }

    public static int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int maxele = piles[0];
        for (int i = 1; i < piles.length; i++) {
            maxele = Math.max(maxele, piles[i]);
        }
        int e = maxele;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (solve(piles, mid) <= h) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public static int solve(int[] arr, int h) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.ceil((double) arr[i] / (double) h);
        }
        return ans;
    }
}
